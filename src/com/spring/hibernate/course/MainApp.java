package com.spring.hibernate.course;

public class MainApp {

	public static void main(String[] args) {
		
		Coach baseBallCoach = new TrackCoach();
		
		System.out.println(baseBallCoach.getDailyWorkout());

	}

}
