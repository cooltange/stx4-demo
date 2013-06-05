package com.stx.demo.action;

import java.io.File;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionSupport;

/**
 * 图像文件上传
 * 
 * @author getan
 * 
 */
public class UploadAction extends ActionSupport {
	// 上传的文件
	private File img;
	// 文件名称
	private String imgFileName;

	@Override
	public String execute() throws Exception {
		// 以当前时间(毫秒数)作为上传后文件的文件名 test.jpg=>
		imgFileName = new Date().getTime() + getExtention(this.imgFileName);
		// 根据服务器的路径创建对应的文件对象
		File imgFileOnServer = new File(ServletActionContext
				.getServletContext().getRealPath("/uploadImgs")
				+ "/"
				+ this.imgFileName);
		// 将客户端上传的文件复制至服务器端(路径为/uploadImgs)
		FileUtils.copyFile(img, imgFileOnServer);

		return SUCCESS;
	}

	/**
	 * 获得上传的文件的扩展名
	 * 
	 * @param fileName
	 * @return String
	 */
	private static String getExtention(String fileName) {
		int pos = fileName.lastIndexOf(".");
		return fileName.substring(pos);
	}

	public File getImg() {
		return img;
	}

	public void setImg(File img) {
		this.img = img;
	}

	public String getImgFileName() {
		return imgFileName;
	}

	public void setImgFileName(String imgFileName) {
		this.imgFileName = imgFileName;
	}

}
