package com.spring.tutorial.project2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements Coach {
	
	@Autowired
	@Qualifier("randomFortuneService")
	private FortuneService fortuneService;

	// define default constructor	
	public TennisCoach() {
		System.out.println(">>TennisCoach: inside the default constructor");
	}
	
	// define setter method
//	@Autowired
//	public void setFortuneService(FortuneService fortuneService) {
//		System.out.println(">>TennisCoach: inside the default fortuneService");
//		this.fortuneService = fortuneService;
//	}
	
//	@Autowired
//	public TennisCoach(FortuneService fortuneService) {
//		this.fortuneService = fortuneService;
//	}

//	@Autowired
//	public void doSomecracyStuff(FortuneService fortuneService) {
//		System.out.println(">>TennisCoach: inside the doSomecracyStuff");
//		this.fortuneService = fortuneService;
//	}	
	
	@Override
	public String getDailyWorkOut() {
		return "Practice your backhand volley";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

}
