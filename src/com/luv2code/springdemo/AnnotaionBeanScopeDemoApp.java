package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotaionBeanScopeDemoApp {

	public static void main(String[] args) {
		//load spring config file
		ClassPathXmlApplicationContext context = new
				ClassPathXmlApplicationContext("applicationContext.xml");
		//retrieve bean from spring container
		Coach theCoach = context.getBean("tennisCoach",Coach.class);
		
		Coach alphaCoach = context.getBean("tennisCoach",Coach.class);
		
		//check if they the same object
	}

}
