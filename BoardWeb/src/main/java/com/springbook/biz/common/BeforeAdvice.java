package com.springbook.biz.common;

import org.aspectj.lang.JoinPoint;

public class BeforeAdvice {
	public void beforeLog(JoinPoint jp) {
		System.out.println("[사전 어드바이스 처리]비즈니스 로직 전 수행");
	}
}
