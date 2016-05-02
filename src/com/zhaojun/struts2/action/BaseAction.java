package com.zhaojun.struts2.action;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionSupport;

public class BaseAction extends ActionSupport{
	private String s;
	private User user;
	@Override
	public String execute(){

		return SUCCESS;
	}
	
	public String add(){
		HttpServletRequest request = ServletActionContext.getRequest();
		request.setAttribute("abc", "cba");
		user = new User();
		user.setPassword("11111111111");
		user.setUsername("222222222");
		String y = "aaaaaaaaaaa";
		s=y;
		return SUCCESS;
	}

	public String getS() {
		return s;
	}

	public void setS(String s) {
		this.s = s;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}
	
}
