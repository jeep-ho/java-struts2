package com.kittyinnovation.structs;

import java.util.Arrays;
import java.util.Date;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionContext;

public class LoginAction {

	public String username;
	public String password;
	public String code;
	public Date logintime;

	public Date getLogintime() {
		return logintime;
	}

	public void setLogintime(Date logintime) {
		this.logintime = logintime;
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

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String execute() throws Exception {
		System.out.println("username=" + this.username + ",password=" + this.password + ",code=" + this.code);
		if (this.username.equals("admin") && this.password.equals("123") && this.code.equals("999")) {
			System.out.println("success");
			ActionContext context=ActionContext.getContext();
			context.getApplication().put("app", "深圳市启迪创新技术有限公司");
			context.getSession().put("ses", username);
			context.put("req", "request:"+username);
			context.put("userlist", Arrays.asList("hezp","lucy","mony"));
			return "success";
		} else {
			System.out.println("error");
			return "error";
		}

	}
	
	public String rsa() throws Exception {
		HttpServletRequest request=ServletActionContext.getRequest();
		ServletContext servletContext=request.getServletContext();
		request.setAttribute("req", "请求范围属性:"+username);
		request.getSession().setAttribute("ses", "回话范围属性："+username);
		servletContext.setAttribute("app", "应用属性：启迪创新");
		return "success";
		
	}
}
