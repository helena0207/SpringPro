package com.springbook.biz.board;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import com.springbook.biz.board.impl.Exam;

public class Program {

	public static void main(String[] args) {
		AbstractApplicationContext factory= new GenericXmlApplicationContext("applicationContext.xml");
		
		Exam exam=(Exam) factory.getBean("lecture");

		System.out.printf("total is %d\n ",exam.total());
	}
	

}
