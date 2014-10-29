package com.science.action;

import com.opensymphony.xwork2.ActionSupport;

public class Demo extends ActionSupport {
	
	@Override
	public String execute() throws Exception {
		System.out.println("!!");
		return SUCCESS;
	}
}
