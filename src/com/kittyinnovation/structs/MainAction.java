package com.kittyinnovation.structs;

import java.util.Date;

public class MainAction {

	public Date birthday;
	public Date getBirthday() {
		return birthday;
	}
	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}
	public int Id;
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public String message;
	public String add() {
		message="add";
		return "success";
	}
	public String execute() {
		message="execute";
		return "success";
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
}
