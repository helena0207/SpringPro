package com.springbook.biz.common;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Service;

@Service
@Aspect
public class Log4jAdvice {
	/*@Pointcut("exectuion(* com.springbook.biz..*Impl.*(..))")
	public void allPointcut() {}
	
	@Pointcut("exectuion(* com.springbook.biz..*Impl.*(..))")
	public void getPointcut() {}*///�ܺο��� ����Ʈ ���� �����ϱ� ����
	
	@Before("PointcutCommon.allPointcut()")
	public void printLogging(JoinPoint jp) {
		System.out.println("[����α� -Log4j ����Ͻ� ���� ������ ����");
	}
}
