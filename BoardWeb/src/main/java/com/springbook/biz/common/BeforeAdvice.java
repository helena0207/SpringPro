package com.springbook.biz.common;

import org.aspectj.lang.JoinPoint;

public class BeforeAdvice {
	public void beforeLog(JoinPoint jp) {
		System.out.println("[���� �����̽� ó��]����Ͻ� ���� �� ����");
	}
}
