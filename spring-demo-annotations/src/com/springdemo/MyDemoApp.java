package com.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyDemoApp {

	public static void main(String[] args) {

		//load the spring config file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

		//retrieve bean from spring container
		TennisCoach theCoach = context.getBean("sillyCoach", TennisCoach.class);
		
		System.out.println(theCoach.getDailyWorkout());
		System.out.println(theCoach.getDailyFortune());
		
		System.out.println(theCoach.getTeam());
		System.out.println(theCoach.getEmail());

	}

}
