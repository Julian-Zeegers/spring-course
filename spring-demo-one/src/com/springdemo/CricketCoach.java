package com.springdemo;

public class CricketCoach implements Coach{
	
	private FortuneService fortuneService;
	
	public CricketCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}
	
	@Override
	public String getDailyWorkout() {
		return "Spend 30 minutes on batting practice";
	}

	@Override
	public String getDailyFortune() {
		
		return fortuneService.getFortune();
	}

}
