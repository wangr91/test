package com.test.provider;


import org.springframework.context.support.ClassPathXmlApplicationContext;
public class Provider {
	public static void main(String[] args) throws Exception {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("provider.xml");
		context.start();
		System.in.read();
	}
}
