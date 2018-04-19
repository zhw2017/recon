package com.pay.recontwo.core.parse.file.base;
package com.pay.recontwo.core.parse.file.base;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import javax.annotation.Resource;

import org.apache.commons.beanutils.BeanUtils;
import org.springframework.context.ApplicationContext;

import com.pay.recontwo.bean.ReturnResult;
import com.pay.recontwo.core.exception.FileParseException;
import com.pay.recontwo.core.service.FileParseSetService;
import com.pay.recontwo.core.service.GenFileFormService;
import com.pay.recontwo.core.utils.ErrorCodeUtis;
import com.pay.recontwo.enums.DataValidityEnum;
import com.pay.recontwo.enums.FieldTypeEnum;
import com.pay.recontwo.model.BaseMapperVO;
import com.pay.recontwo.model.BusiAssSet;
import com.pay.recontwo.model.FileParseLog;
import com.pay.recontwo.model.FileParseSet;
import com.pay.recontwo.model.FileTempletSet;
import com.pay.recontwo.model.GenFileForm;

/**
 * @Description: 单一文件解析初步实现
 * @see: GenFileTransBase 此处填写需要参考的类
 * @version 2017年3月14日 上午11:02:54
 * @author guangzhi.ji
 */
public abstract class GenFileTransBase<T extends BaseMapperVO, V extends BaseMapperVO> extends BaseFileTransImpl<T, V> implements GenFileTrans<T, V> {
	private Class<T> entityClass;
	@Resource
	private ApplicationContext applicationContext;
	@Resource
	private FileParseSetService fileParseSetService;
	@Resource
	private GenFileFormService genFileFormService;

	public GenFileTransBase(Class<T> entityClass) {
		this.entityClass = entityClass;
	}

	/**
	 * @Description 一句话描述方法用法
	 * @param busiAssSet
	 * @param fileAllPath
	 * @param fileTempletSet
	 * @param bankInstNo
	 * @param clearDate
	 * @return
	 * @throws Exception
	 * @see 需要参考的类或方法
	 */
	@Override
	public List<T> parseFile(BusiAssSet busiAssSet, FileTempletSet fileTempletSet, FileParseLog fileParseLog, String clearDate, String settleDate) throws Exception {
		List<T> listBankOrder = new ArrayList<>();
		/** 读取文件流 */
		BufferedReader reader = null;
		FileInputStream fis = null;
		InputStreamReader isr = null;
		/** 行缓存 */
		String line = null;
		/** 读取行计数器 */
		int row = 0;
		int useRow = 0;
		try {
			/** 解析规则 */
			List<GenFileForm> listGenFileForm = genFileFormService.findByFileTempletSetId(fileTempletSet.getId());
			HashMap<String, GenFileForm> loadGenFileFormMap = loadGenFileFormMap(listGenFileForm);
			String fileSeparator = fileTempletSet.getFileSeparator();
			HashMap<String, String> numberMap = null;
			/** 读取文件 */
			String fileAllPath = fileParseLog.getLocalDir() + fileParseLog.getFileName();
			fis = new FileInputStream(fileAllPath);
			isr = new InputStreamReader(fis, fileTempletSet.getFileCharacter().trim());
			reader = new BufferedReader(isr);
			while ((line = reader.readLine()) != null) {
				row++;
				/** 行数计数器加1 */
				if (StringUtils.isBlank(line)) {
					continue;
				}
				line = beforeParseLineToBean(line);
				if (isFilterLineBaseOnString(line, fileSeparator, row)) {
					continue;
				}
				String[] tempFields = line.split(fileSeparator);
				if (row == 1) {
					if (isExistTitle()) {
						/** 获取表头MAP */
						numberMap = getHeadTitleMap(tempFields);
						continue;
					}
				}
				if (row % 100000 == 0) {
					log.info("Had parse Line Rows:" + row);
				}
				T model = entityClass.newInstance();
				/** 默认为有效数据 */
				BeanUtils.setProperty(model, "dataValidity", DataValidityEnum.VALID.toString());
				/** 按配置的规则解析每行到BankOrder */
				parseLineToBean(clearDate, model, tempFields, loadGenFileFormMap, numberMap);
				log.info("parseLineToBean,model={}", model);
				/** 判断是否过滤 */
				if (isFilterLineBaseOnBean(busiAssSet, model)) {
					continue;
				}
				useRow++;
				/** 补充业务数据 */
				suppleBusiData(fileParseLog.getInstNo(), clearDate, settleDate, model, busiAssSet);
				/** 解析行之后处理 */
				afterParseLineToBean(model);
				/** 文件名为必须字段 */
				BeanUtils.setProperty(model, "fileName", fileParseLog.getFileName());
				listBankOrder.add(model);
			}
			log.info("Had parse Line total Rows:" + row + ",use Rows:" + useRow);
			fileParseLog.setFileTotalRow(row);
			fileParseLog.setFileUseRow(useRow);
		} catch (Exception e) {
			log.error("parse error row:" + row + "");
			throw new FileParseException(ErrorCodeUtis.PARSE_FILE_PRO_ERROR, e.getMessage());
		} finally {
			try {
				if (reader != null) {
					reader.close();
				}
				if (isr != null) {
					isr.close();
				}
				if (fis != null) {
					fis.close();
				}
			} catch (IOException e) {
				log.error("parse close io error " + e.getMessage());

			}

		}
		return listBankOrder;
	}

	/**
	 * @Description 按配置的规则解析每行到BankOrder
	 * @param line
	 * @param listUnionFileForm
	 * @return
	 * @throws InvocationTargetException
	 * @throws IllegalAccessException
	 * @see 需要参考的类或方法
	 */
	protected void parseLineToBean(String fileDate, T bean, String[] values, HashMap<String, GenFileForm> loadGenFileFormMap, HashMap<String, String> numberMap)
			throws Exception {
		for (int i = 0; i < values.length; i++) {
			if (values[i] == null || "".equals(values[i].trim())) {
				continue;
			}
			values[i] = values[i].trim();
			GenFileForm genFileForm = null;
			if (isExistTitle()) {
				String fileFieldCodeUp = numberMap.get(String.valueOf(i));
				genFileForm = loadGenFileFormMap.get(fileFieldCodeUp);
			} else {
				genFileForm = loadGenFileFormMap.get(String.valueOf(i + 1) + "");
			}
			if (genFileForm == null) {
				continue;
			}
			String savleFieldCode = genFileForm.getSavleFieldCode();
			String savleFieldType = genFileForm.getSavleFieldType();
			Object object = null;
			if (FieldTypeEnum.STRING.toString().equals(savleFieldType)) {
				object = values[i];
			} else if (FieldTypeEnum.DATETIME.toString().equals(savleFieldType)) {
				if (values[i].indexOf(":") > 0) {
					object = DateUtils.parseDate(values[i], "yyyy-MM-dd HH:mm:ss");
				} else if (values[i].indexOf("-") > 0) {
					object = DateUtils.parseDate(values[i], "yyyy-MM-dd");
				} else {
					object = DateUtils.parseDate(values[i], "yyyyMMdd");
				}
			} else if (FieldTypeEnum.NUMBER.toString().equals(savleFieldType)) {
				object = Double.valueOf(values[i]);
			} else if (FieldTypeEnum.DAY.toString().equals(savleFieldType)) {
				if (values[i].indexOf("-") > 0) {
					if (values[i].length() < 10) {
						object = fileDate;
						log.error("DAY-type,vaule:" + values[i] + "<10");
					} else {
						object = values[i].substring(0, 10);
					}
				} else {
					if (values[i].length() < 8) {
						object = fileDate;
						log.error("DAY-type,vaule:" + values[i] + "<8");
					} else {
						object = values[i].substring(0, 4) + "-" + values[i].substring(4, 6) + "-" + values[i].substring(6, 8);
					}
				}
			}
			if (object != null) {
				log.info("object={}", object);
				BeanUtils.setProperty(bean, savleFieldCode, object);
			}
		}
	}

	/**
	 * @Description 一句话描述方法用法
	 * @param title
	 * @return
	 * @see 需要参考的类或方法
	 */
	protected HashMap<String, String> getHeadTitleMap(String[] title) {
		/** 存储以列数为KEY的MAP 用于读取CSV文件存储列名 */
		HashMap<String, String> numberMap = new HashMap<String, String>();
		if (title != null && title.length > 0) {
			for (int i = 0; i < title.length; i++) {
				String col = title[i].trim();
				/** 去除表头字段乱码只保留英文和下划线 */
				// col = keepEnglish(col);
				numberMap.put(i + "", col.toUpperCase());
			}
		}
		return numberMap;
	}

	/**
	 * @Description 筛选字符串只取英文和下划线
	 * @param wantString
	 * @return
	 * @see 需要参考的类或方法
	 */
	protected String keepEnglish(String wantString) {
		StringBuffer result = new StringBuffer();
		for (int i = 0; i < wantString.length(); i++) {
			char a = wantString.charAt(i);
			if ((((int) a) >= 65 && ((int) a) <= 90) || (((int) a) >= 97 && ((int) a) <= 122) || ((int) a) == 95) {
				result.append(a);
			}
		}
		return result.toString();
	}

	protected HashMap<String, GenFileForm> loadGenFileFormMap(List<GenFileForm> listGenFileForm) {
		HashMap<String, GenFileForm> map = new HashMap<>();
		for (GenFileForm genFileForm : listGenFileForm) {
			if (isExistTitle()) {
				String savleFieldCode = genFileForm.getSavleFieldCode();
				if (StringUtils.isBlank(savleFieldCode)) {
					continue;
				}
				map.put(genFileForm.getFileFieldCode().toUpperCase(), genFileForm);
			} else {
				map.put(genFileForm.getSequence() + "", genFileForm);

			}
		}
		return map;
	}

	@Override
	public void beforeParseFile(ReturnResult<V> returnResult, List<T> listModel, BusiAssSet busiAssSet, FileParseSet fileParseSet, FileTempletSet fileTempletSet,
			FileParseLog fileParseLog) {

	}

	@Override
	public void afterParseFile(ReturnResult<V> returnResult, List<T> listModel, BusiAssSet busiAssSet, FileParseSet fileParseSet, FileTempletSet fileTempletSet,
			FileParseLog fileParseLog) {

	}

	@Override
	public void delHistoryData(String instNo, String busiCode, String clearDate, String fileName) {

	}

	@Override
	public String beforeParseLineToBean(String line) {
		return line;
	}

	@Override
	public boolean isExistTitle() {
		return true;
	}

	@Override
	public boolean isFilterLineBaseOnBean(BusiAssSet busiAssSet, T model) {
		return false;
	}

	@Override
	public boolean isFilterLineBaseOnString(String line, String fileSeparator, int row) {
		return false;
	}

	/**
	 * @Description 补充业务数据
	 * @param clearDate
	 * @param model
	 * @param busiAssSet
	 * @see 需要参考的类或方法
	 */
	public abstract void suppleBusiData(String bankInstNo, String clearDate, String settleDate, T model, BusiAssSet busiAssSet);

	/**
	 * @Description 解析每行之后处理
	 * @param model
	 * @see 需要参考的类或方法
	 */
	public abstract void afterParseLineToBean(T model);

	public FileParseSetService getFileParseSetService() {
		return fileParseSetService;
	}

	public void setFileParseSetService(FileParseSetService fileParseSetService) {
		this.fileParseSetService = fileParseSetService;
	}

	public GenFileFormService getGenFileFormService() {
		return genFileFormService;
	}

	public void setGenFileFormService(GenFileFormService genFileFormService) {
		this.genFileFormService = genFileFormService;
	}

}

