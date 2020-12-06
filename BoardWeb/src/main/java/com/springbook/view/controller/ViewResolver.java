package com.springbook.view.controller;

public class ViewResolver {
	public String prefix;
	public String suffix;
	
	
	public void setPrefix(String prefix) {//접두사
		this.prefix = prefix;
	}
	
	public void setSuffix(String suffix) {//접미사
		this.suffix = suffix;
	}
	
	public String getView(String viewName) {
		return prefix +viewName+suffix;
	}
}
