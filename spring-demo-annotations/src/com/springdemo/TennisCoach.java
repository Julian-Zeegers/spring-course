package com.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class TennisCoach implements Coach {
	
	//Field injection
	@Autowired
	@Qualifier("randomFortuneService") //Use if there are multiple implementations
	private FortuneService fortuneService;
	
	@Value("${foo.email}")
	private String email;
	
	@Value("${foo.team}")
	private String team;
	
	public String getTeam() {
		return team;
	}

	public String getEmail() {
		return email;
	}
	
	/*//Constructor injector
	@Autowired
	public TennisCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}*/

	@Override
	public String getDailyWorkout() {
		return "Hit volleys";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}


	
	//Setter injector

	/*@Autowired
	public void setFortuneService(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}*/
	
	
	
	

}
