package com.spring.hibernate.course;

public class BaseBallCoach implements Coach{

	@Override
	public String getDailyWorkout() {
		return "Spending 30 minutes on batting practice";
	}
}
