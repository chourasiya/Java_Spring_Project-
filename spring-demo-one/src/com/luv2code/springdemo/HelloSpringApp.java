package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpringApp {
	public static void main(String[] args) {
		//load the spring conf file
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//retrieve bean from spring container
		CricketCoach theCoach = context.getBean("myCoach", CricketCoach.class);
		// call methods on the bean 
		System.out.println(theCoach.getDailyWorkout());
		// close the context
		System.out.println(theCoach.getDailyFortune());
		context.close();
	}

}
