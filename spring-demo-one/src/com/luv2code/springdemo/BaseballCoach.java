package com.luv2code.springdemo;

public class BaseballCoach implements Coach {
	
	private FortuneService fortuneservice;
	
	public BaseballCoach() {
		
	}
	 
	public BaseballCoach(FortuneService thefortuneservice){
		fortuneservice= thefortuneservice;
		
	}
	
	@Override
	public String getDailyWorkout() {
		return "Spend Your time in Trademill";

}

	@Override
	public String getDailyFortune() {
	
		return fortuneservice.getFortune();
	}
}
