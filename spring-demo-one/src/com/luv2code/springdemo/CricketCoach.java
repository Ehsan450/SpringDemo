package com.luv2code.springdemo;

public class CricketCoach implements Coach {
	private FortuneService fortuneService;
	private String emailAddress;
	private String team ;
	
	public String getEmailAddress() {
		return emailAddress;
	}
	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}
	public String getTeam() {
		return team;
	}
	public void setTeam(String team) {
		this.team = team;
	}
	public  CricketCoach() {
		
		
	}
	@Override
	public String getDailyWorkout() {
		return "Bowl at 150kmh";
	}

	public void setFortuneService(FortuneService fortuneService) {
		//System.out.println("NOOO SETTER");
		this.fortuneService = fortuneService;
		
		
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return fortuneService.getFortune();
	}
}
