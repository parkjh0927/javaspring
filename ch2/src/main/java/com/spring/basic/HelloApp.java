package com.spring.basic;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

// Spring framework
// �ν��Ͻ��� �����ϰ� ����=> ��� �ν��Ͻ��� �����ϰ� �����ϴ� ���� �ƴϰ� ������ �ν��Ͻ��� ó��
//						�ν��Ͻ� ���� �� singleton ���

public class HelloApp {

	public static void main(String[] args) {
		
		System.out.println("=== �����̳� ���� �� ===");
		
		// src/main/resources ==> ClassPath
		
		ApplicationContext ctx = new ClassPathXmlApplicationContext("config.xml");
		
		System.out.println("=== �����̳� ���� �� ===");
		MessageBean msg = (MessageBean) ctx.getBean("msg");
		msg.sayHello("ȫ�浿");

	}

}
