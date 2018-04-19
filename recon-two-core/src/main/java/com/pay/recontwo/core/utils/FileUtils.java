package com.pay.recontwo.core.utils;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Enumeration;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.zip.GZIPInputStream;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;


/**
 * @Description: 这里用一句话描述这个类的作用
 * @see: FileUtils 此处填写需要参考的类
 * @version 2016年10月17日 下午4:25:08
 * @author guangzhi.ji
 */
@Component
public class FileUtils {
	private Logger log = LoggerFactory.getLogger(FileUtils.class);

	/**
	 * 检查路径的合法性。
	 * @param path
	 *            待检查的路径
	 */
	public String chechPath(String path) {
		if (!path.endsWith("/") && !path.endsWith("\\")) {
			path = path + "/";
		}
		return path;
	}

	/**
	 * @Description 创建文件或目录 可以强制创建
	 * @param completeFileName
	 * @param force
	 * @throws BusinessException
	 * @see 需要参考的类或方法
	 */
	public void createDir(String completeFileName) throws RuntimeException {
		try {
			File file = new File(completeFileName);
			if (!file.exists()) {
				file.mkdirs();
			}
		} catch (Exception e) {
			log.error("createFileOrDir-error:" + e.getMessage());
			throw new RuntimeException(e.getMessage());
		}
	}

	/**
	 * @Description 创建文件或目录 可以强制创建
	 * @param completeFileName
	 * @param force
	 * @throws BusinessException
	 * @see 需要参考的类或方法
	 */
	public void createFile(String completeFileName, boolean force) throws RuntimeException {
		try {
			File file = new File(completeFileName);
			if (!file.exists()) {
				File parentFile = file.getParentFile();
				parentFile.mkdirs();
				boolean createNewFile = file.createNewFile();
				if (!createNewFile) {
					throw new RuntimeException("file.createNewFile.error");
				}
			} else {
				if (force) {
					boolean createNewFile = file.createNewFile();
					if (!createNewFile) {
						throw new RuntimeException("file.createNewFile.error");
					}
				}
			}
		} catch (Exception e) {
			log.error("createFileOrDir-error:" + e.getMessage());
			throw new RuntimeException(e.getMessage());
		}
	}

	/**
	 * 删除文件(夹)
	 * @param file
	 * @return
	 */
	public boolean deleteFile(File file) {
		boolean flag = true;
		if (file.isDirectory()) {
			for (File f : file.listFiles()) {
				flag = flag && deleteFile(f);
			}
			flag = flag && file.delete();
		} else {
			flag = flag && file.delete();
		}
		return flag;
	}

	/**
	 * 文件移动
	 * @param source
	 * @param target
	 * @param pattern
	 * @return
	 */
	public boolean removeFile(File source, File target, Pattern pattern) {
		boolean flag = true;
		if (source.isDirectory()) {
			for (File f : source.listFiles()) {
				flag = flag && removeFile(f, target, pattern);
			}
		} else {
			Matcher m = pattern.matcher(source.getName());
			if (m.find()) { // 判断文件名
				flag = flag && source.renameTo(new File(target, source.getName()));
			}
		}
		return flag;
	}

	/**
	 * @Description 一句话描述方法用法
	 * @param fileName
	 * @return
	 * @see 需要参考的类或方法
	 */
	public String converFileName(String fileName, String oDate) {
		String regexFirst = SelfStringUtils.regexFirst(fileName, "\\(([^)]*)\\)");
		String realDate = oDate;
		if (regexFirst != null) {
			int parseInt = Integer.parseInt(regexFirst);
			/** 按(-1)调整日期 */
			realDate = SelfDateUtils.getAfterOrBeforDay(oDate, parseInt);
			/** 将(-1)替换为空 */
			fileName = fileName.replaceAll("\\(" + parseInt + "\\)", "");
		}
		String noLineDate = realDate.replaceAll("-", "");
		String yyyy = realDate.substring(0, 4);
		String yyyySimple = realDate.substring(2, 4);
		String mm = realDate.substring(5, 7);
		String dd = realDate.substring(8, 10);
		String hh = null;
		if (realDate.length() > 10) {
			hh = realDate.substring(11, 13);
		}
		/** 将日期替换 */
		fileName = fileName.replaceAll("\\{YYYYMMDD\\}", noLineDate);
		fileName = fileName.replaceAll("\\{YYYY-MM-DD\\}", realDate);
		fileName = fileName.replaceAll("\\{YYMMDD\\}", yyyySimple + mm + dd);
		fileName = fileName.replaceAll("\\{YYYYMM\\}", yyyy + mm);
		fileName = fileName.replaceAll("\\{YYYYMMDDHH\\}", yyyy + mm + dd + hh);
		return fileName;
	}

	/**
	 * @Description 获取文件编码方式
	 * @param fileName
	 * @return
	 * @throws IOException
	 * @see 需要参考的类或方法
	 */
	@SuppressWarnings("resource")
	public String getCharset(String fileName) throws IOException {
		FileInputStream fileInputStream = null;
		BufferedInputStream bin = null;
		String code = null;
		try {
			new FileInputStream(fileName);
			bin = new BufferedInputStream(fileInputStream);
			int p = (bin.read() << 8) + bin.read();
			switch (p) {
			case 0xefbb:
				code = "UTF-8";
				break;
			case 0xfffe:
				code = "Unicode";
				break;
			case 0xfeff:
				code = "UTF-16BE";
				break;
			case 0x5c75:
				code = "ANSI|ASCII";
				break;
			default:
				code = "GBK";
			}
		} catch (Exception e) {
			log.error(e.getMessage());
		} finally {
			if (bin != null) {
				bin.close();
			}
			if (fileInputStream != null) {
				fileInputStream.close();
			}
		}
		return code;
	}

	/**
	 * 解压缩文件
	 * @param zipFile
	 * @param folder
	 */
	@SuppressWarnings("unchecked")
	public void fUn(File zipFile, String localDir, String fileNameCode, boolean isCreateDir) {
		try {
			if (isCreateDir) {
				String fderN = zipFile.getName();
				fderN = fderN.substring(0, fderN.lastIndexOf("."));
				File fder = new File(localDir + fderN);
				fder.mkdirs();
			}
			// zip文件
			if (zipFile.getName().toLowerCase().contains("zip")) {
				ZipFile zf = null;
				if (fileNameCode == null) {
					zf = new ZipFile(zipFile);
				} else {
					zf = new ZipFile(zipFile, fileNameCode);
				}
				Enumeration<ZipEntry> zes = zf.getEntries();
				while (zes.hasMoreElements()) {
					try {
						ZipEntry ze = zes.nextElement();
						if (ze.isDirectory()) {
							new File(localDir + ze.getName()).mkdirs();
						} else {
							File file = new File(localDir + ze.getName());
							file.getParentFile().mkdirs();

							OutputStream os = new FileOutputStream(file);
							InputStream is = zf.getInputStream(ze);
							byte[] buf = new byte[2048];
							int len = -1;
							while ((len = is.read(buf, 0, buf.length)) != -1) {
								os.write(buf, 0, len);
							}
							os.flush();
							os.close();
							is.close();

							String fn = file.getName();
							int fnl = fn.length();
							if (".zip".equals(fn.substring(fnl - 4, fnl))) {
								fUn(file, file.getParentFile().getPath(), fileNameCode, isCreateDir);
								file.delete();
							}
						}
					} catch (Exception e) {
						log.error("hasMoreElements Exception: {} - {}", e, e.getMessage());
					}
				}
				zf.close();
			} else if (zipFile.getName().toLowerCase().contains("gz")) {
				File ss = new File(zipFile.getPath());
				TarInputStream tis = new TarInputStream(new GZIPInputStream(new BufferedInputStream(new FileInputStream(ss))));
				TarEntry entry;
				while ((entry = tis.getNextEntry()) != null) {
					int count;
					byte data[] = new byte[204800];
					FileOutputStream fos = new FileOutputStream(new File(localDir + "/" + entry.getName()));
					BufferedOutputStream dest = new BufferedOutputStream(fos);

					while ((count = tis.read(data)) != -1) {
						dest.write(data, 0, count);
					}
					dest.flush();
					dest.close();
				}
				tis.close();
			}
		} catch (Exception e) {
			log.error("FileUtils ZipException: {} - {}", e, e.getMessage());
		}
	}

}
