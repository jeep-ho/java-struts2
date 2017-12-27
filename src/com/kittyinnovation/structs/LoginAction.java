package com.kittyinnovation.structs;

public class LoginAction {

	public String username;
	public String password;
	public String code;

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
			return "success";
		} else {
			System.out.println("error");
			return "error";
		}

	}
}
