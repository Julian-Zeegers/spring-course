package com.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopeDemoApp {

	public static void main(String[] args) {

		//load config
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beanScope-applicationContext.xml");

		//retrieve bean from spring container
		Coach theCoach = context.getBean("myCoach", Coach.class);
		Coach alphaCoach = context.getBean("myCoach", Coach.class);
		
		
		//retrieve bean
		boolean result = (theCoach == alphaCoach);
		System.out.println("Pointing to same: "+result);
		System.out.println("Memory: "+theCoach);
		System.out.println("Memory: "+alphaCoach);
		
		context.close();

	}

}
