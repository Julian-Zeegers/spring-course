package com.springdemo;

public class TrackCoach implements Coach {
	
	private FortuneService fortuneService;
	
	public TrackCoach() {

	}

	public TrackCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		return "Run hard 5km";
	}

	@Override
	public String getDailyFortune() {
		return "Just do it: "+fortuneService.getFortune();
	}
	
	//add init method
	
	public void doMyStartupStuff() {
		System.out.println("TrackCoach: inside startup");
	}
	
	//add destory method
	
	public void doMyCleanupStuff() {
		System.out.println("TrackCoach: inside cleanup");
	}

}
