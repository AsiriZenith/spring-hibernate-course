package com.spring.hibernate.course;

public class TrackCoach implements Coach {
	
	private FortuneService fortuneService;

	
	public TrackCoach(FortuneService fortuneService) {
		super();
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		return "Run a hard 5km";
	}

	@Override
	public String getDailyFortune() {
		return "Just do it: " + fortuneService.getFortune();
	}

	// add an initiate method
	public void doMyStarupStaff() {
		System.out.println("Track Coach: inside method doMyStarupStaff");
	}
	
	// add a destroy method
	public void doMyCleanupStaffYoYo() {
		System.out.println("Track Coach: inside method doMyCleanupStaffYoYo");
	}
}
