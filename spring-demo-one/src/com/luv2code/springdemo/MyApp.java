
  package com.luv2code.springdemo;
  
  public class MyApp { public static void main(String[] args) {
  
  Coach thecoach=new BaseballCoach(null);
  System.out.println(thecoach.getDailyWorkout()); Coach thecricketcoach=new
  CricketCoach(); System.out.println(thecricketcoach.getDailyWorkout()); Coach
  theFootballCoach = new FootballCoach();
  System.out.println(theFootballCoach.getDailyWorkout());
  
  }
  
  }
 