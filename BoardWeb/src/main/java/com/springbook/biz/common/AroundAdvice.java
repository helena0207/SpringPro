package com.springbook.biz.common;

import org.aspectj.lang.ProceedingJoinPoint;

public class AroundAdvice {
	public Object aroundLog(ProceedingJoinPoint pjp) throws Throwable {
		System.out.println("[BEFORE]荐青傈 贸府");
		
		Object returnObj=pjp.proceed();
		
		System.out.println("[AFTER]荐青饶 贸府");
		return returnObj;
	}
}
