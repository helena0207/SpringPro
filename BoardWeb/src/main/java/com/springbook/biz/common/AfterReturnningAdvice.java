package com.springbook.biz.common;

import org.aopalliance.intercept.Joinpoint;

public class AfterReturnningAdvice {
	public void aftereLog(Joinpoint jp) {
		System.out.println("[����ó��]����Ͻ� ���� �� ����");
	}
}
