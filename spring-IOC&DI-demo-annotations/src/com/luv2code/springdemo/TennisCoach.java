package com.luv2code.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements Coach {
	@Autowired
	@Qualifier("randomService")
	private FortuneService fortuneService;
	public TennisCoach() {
		System.out.println(">>inside default constructor");
	}
	@Override
	public String getDailyWorkout() {
		return "Practice your backend volley";
	}
	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return fortuneService.getFortune();
	}
	

}
