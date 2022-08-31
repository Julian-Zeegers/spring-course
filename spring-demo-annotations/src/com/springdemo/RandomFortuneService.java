package com.springdemo;

import java.util.Random;

import org.springframework.stereotype.Component;

@Component
public class RandomFortuneService implements FortuneService {

	@Override
	public String getFortune() {
		
		Random r = new Random();
		int rand = r.nextInt(2);
		
		switch(rand) {
		case 0:
			return "Today is a bad day";
		case 1:
			return "Need more practice";
		case 2:
			return "Good job";
		default:
			return "Not random";
		}
		
		
	}

}
