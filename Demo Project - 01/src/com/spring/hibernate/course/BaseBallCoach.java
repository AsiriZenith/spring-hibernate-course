package com.spring.hibernate.course;

public class BaseBallCoach implements Coach{
	
	// define a private field for the dependency
	private FortuneService fortuneService;
	
	// define a constructor for dependency injection
	public BaseBallCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		return "Spending 30 minutes on batting practice";
	}

	@Override
	public String getDailyFortune() {
		// use my fortune service to get a fortune
		return fortuneService.getFortune();
	}
}
