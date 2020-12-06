package com.springbook.biz.common;

import org.aopalliance.intercept.Joinpoint;

public class AfterReturnningAdvice {
	public void aftereLog(Joinpoint jp) {
		System.out.println("[사후처리]비즈니스 로직 후 수행");
	}
}
