package com.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationBeanScopeAppDemo {

	public static void main(String[] args) {


		//load the spring config file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

		//retrieve bean from spring container
		Coach theCoach = context.getBean("tennisCoach", Coach.class);
		Coach alphaCoach = context.getBean("tennisCoach", Coach.class);
		
		//retrieve bean
		boolean result = (theCoach == alphaCoach);
		System.out.println("Pointing to same: "+result);
		System.out.println("Memory: "+theCoach);
		System.out.println("Memory: "+alphaCoach);
		
		context.close();

	}

}
