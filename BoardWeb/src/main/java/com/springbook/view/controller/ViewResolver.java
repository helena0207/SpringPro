package com.springbook.view.controller;

public class ViewResolver {
	public String prefix;
	public String suffix;
	
	
	public void setPrefix(String prefix) {//���λ�
		this.prefix = prefix;
	}
	
	public void setSuffix(String suffix) {//���̻�
		this.suffix = suffix;
	}
	
	public String getView(String viewName) {
		return prefix +viewName+suffix;
	}
}
