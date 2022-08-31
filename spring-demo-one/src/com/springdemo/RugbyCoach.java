package com.springdemo;

public class RugbyCoach implements Coach {
	
	private FortuneService fortuneService;
	
	private String emailAddress;
	private String team;

	public RugbyCoach() {
		System.out.println("Rugby Constuctor called");
	}

	@Override
	public String getDailyWorkout() {
		return "Tackle Practice";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}
	
	//Setter method
	public void setFortuneService(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}

	public String getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}

	public String getTeam() {
		return team;
	}

	public void setTeam(String team) {
		this.team = team;
	}
	

}
