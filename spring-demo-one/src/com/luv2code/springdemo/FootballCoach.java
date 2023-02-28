package com.luv2code.springdemo;

public class FootballCoach implements Coach {
	private FortuneService fortuneservice;
	/* public FootballCoach footballCoach; */
	
	public FootballCoach() {
		
	}
	
	public FootballCoach(FortuneService theFortune) {
		fortuneservice=theFortune;
	}
	@Override
	public String getDailyWorkout() {
		return "Playyy football";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return "Just Do iT: " + fortuneservice.getFortune();
	}

}
