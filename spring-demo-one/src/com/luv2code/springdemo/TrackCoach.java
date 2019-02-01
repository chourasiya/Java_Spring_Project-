package com.luv2code.springdemo;

public class TrackCoach implements Coach {
	private FortuneService fortuneService;
	public TrackCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}
	public TrackCoach() {
		
	}
	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "Run a hard 5k";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return fortuneService.getFortune();
	}

}
