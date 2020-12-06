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
	public void getPointcut() {}*///외부에서 포인트 컷을 참조하기 위해
	
	@Before("PointcutCommon.allPointcut()")
	public void printLogging(JoinPoint jp) {
		System.out.println("[공통로그 -Log4j 비즈니스 로직 수행전 동작");
	}
}
