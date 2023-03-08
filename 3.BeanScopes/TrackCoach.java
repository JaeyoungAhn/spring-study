package com.spring.springdemo;

public class TrackCoach implements Coach {

	private FortuneService fortuneService;
	
	public TrackCoach() {
		
	}
	
	public TrackCoach(FortuneService fortuneService) {
		super();
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		return "Run a hard 5k";
	}

	@Override
	public String getDailyFortune() {
		return "Just Do It: " + fortuneService.getFortune();
	}
	
	// add an init method
	public void doMyStartStuff() {
		System.out.println("TrackCoach: inside method doingMyStartStuff");
		
	}
	
	// add a destroy method
	public void doMyCleanUpStuffYoYo() {
		System.out.println("TrackCoach: inside method doMyCleanupStuffYoYo");
		
	}

}
