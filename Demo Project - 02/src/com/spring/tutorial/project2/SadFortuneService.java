package com.spring.tutorial.project2;

public class SadFortuneService implements FortuneService{

	@Override
	public String getFortune() {
		return "Today is a sad day!";
	}

}
