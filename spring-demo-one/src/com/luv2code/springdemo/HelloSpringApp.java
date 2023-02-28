package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpringApp {

	public static void main(String[] args) {
		/*
		 * HappyFortuneService happy = new HappyFortuneService(); FootballCoach foot =
		 * new FootballCoach();
		 */
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		Coach theCoach = context.getBean("myCoach", Coach.class);
		Coach thefootballCoach = context.getBean("FootballCoach", Coach.class);
		/*
		 * Coach theCoach1 = context.getBean("myFortune",Coach.class);
		 */
		System.out.println(theCoach.getDailyWorkout());
		System.out.println(theCoach.getDailyFortune());
		System.out.println(thefootballCoach.getDailyFortune());
		/* System.out.println(happy.getFortune(foot)); */

		context.close();

	}
}