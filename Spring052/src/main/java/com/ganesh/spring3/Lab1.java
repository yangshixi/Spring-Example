package com.ganesh.spring3;
import org.springframework.context.*;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Lab1 {
	private static ApplicationContext ctx;
	public static void main(String[] args) {
		ctx = new ClassPathXmlApplicationContext("ioc.xml");
		System.out.println("Spring Container is Ready");
		System.out.println("-----");
		Hello h=(Hello)ctx.getBean("hello");
		h.show();		
	}
}