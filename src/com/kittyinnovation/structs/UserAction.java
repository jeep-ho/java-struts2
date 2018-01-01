package com.kittyinnovation.structs;

import java.io.File;
import java.io.IOException;

import org.apache.commons.fileupload.servlet.ServletRequestContext;
import org.apache.commons.io.FileUtils;
import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class UserAction extends ActionSupport {
	public String username;
	public String password;
	public File[] face;
	public String[] faceFileName;
	public String[] faceContentType;

	public String[] getFaceContentType() {
		return faceContentType;
	}

	public void setFaceContentType(String[] faceContentType) {
		this.faceContentType = faceContentType;
	}

	public String[] getFaceFileName() {
		return faceFileName;
	}

	public void setFaceFileName(String[] faceFileName) {
		this.faceFileName = faceFileName;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public File[] getFace() {
		return face;
	}

	public void setFace(File[] face) {
		this.face = face;
	}

	public String execute() {
		String realPath = ServletActionContext.getServletContext().getRealPath("//images");
		System.out.println("path:" + realPath);
		System.out.println("filename:" + faceFileName);
		System.out.println(username);
		System.out.println(password);
		for (int i = 0; i < face.length; i++) {
			File savefile = new File(new File(realPath), faceFileName[i]);
			if (face != null) {
				if (!savefile.getParentFile().exists())
					savefile.getParentFile().mkdirs();
				try {
					FileUtils.copyFile(face[i], savefile);
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
		ActionContext.getContext().put("message", "注册成功！");
		return "success";
	}

	public String update() {
		String realPath = ServletActionContext.getServletContext().getRealPath("//images");
		System.out.println("path:" + realPath);
		System.out.println("filename:" + faceFileName);
		System.out.println(username);
		System.out.println(password);
		for (int i = 0; i < face.length; i++) {
			File savefile = new File(new File(realPath), faceFileName[i]);
			if (face != null) {
				if (!savefile.getParentFile().exists())
					savefile.getParentFile().mkdirs();
				try {
					FileUtils.copyFile(face[i], savefile);
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
		ActionContext.getContext().put("message", "更新成功！");
		return "success";
	}

	/* 只对修改方法校验 */
//	public void validateUpdate() {
//		if (this.username == "" || "".equals(this.username.trim())) {
//			this.addFieldError("username", "用户名不可空！");
//		}
//		if (this.password == "" || "".equals(this.password.trim())) {
//			this.addFieldError("password", "密码不可空！");
//		}
//		if (this.password.length() < 6) {
//			this.addFieldError("password", "密码长度不能少于6位！");
//		}
//	}

	/* 对所有Action校验 */
//	@Override
//	public void validate() {
//		if (this.username == "" || "".equals(this.username.trim())) {
//			this.addFieldError("username", "用户名不可空！");
//		}
//		if (this.password == "" || "".equals(this.password.trim())) {
//			this.addFieldError("password", "密码不可空！");
//		}
//		if (this.password.length() < 6) {
//			this.addFieldError("password", "密码长度不能少于6位！");
//		}
//		// super.validate();
//	}

}
