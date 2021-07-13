package com.spring.hibernate.course;

public class CricketCoach implements Coach {
	
	private FortuneService fortuneService;
	private String emailAddress;
	private String team;

	
	public void setEmailAddress(String emailAddress) {
		System.out.println("CricketCoach : inside on-arg setEmailAddress");
		this.emailAddress = emailAddress;
	}

	public void setTeam(String team) {
		System.out.println("CricketCoach : inside on-arg setTeam");
		this.team = team;
	}

	public String getEmailAddress() {
		return emailAddress;
	}

	public String getTeam() {
		return team;
	}

	// create no argument constructor 
	public CricketCoach() {
		System.out.println("CricketCoach : inside on-arg constructor");
	}
	
	public void setFortuneService(FortuneService fortuneService) {
		System.out.println("Inside the setter method - setFortuneService");
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout(){
		return "Practice fast bowling for 15 minutes";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

}