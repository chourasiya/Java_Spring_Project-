package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SetterDemoApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//load the spring conf file
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("applicationContext.xml");
				
		//retrieve bean from spring container
	    CricketCoach theCoach = context.getBean("myCricketCoach", CricketCoach.class);
		// call methods on the bean 
		System.out.println(theCoach.getDailyWorkout());
		// close the context
		System.out.println(theCoach.getDailyFortune());
		// call new methods
		System.out.println(theCoach.getEmailAddress());
		
		System.out.println(theCoach.getTeam());
		
		System.out.println(theCoach.getDailyFortune());
		context.close();
	}

}
