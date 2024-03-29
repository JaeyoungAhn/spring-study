package com.spring.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpringApp {

	public static void main(String[] args) {

		// load the spring configuration file
		ClassPathXmlApplicationContext context =
				new ClassPathXmlApplicationContext("applicationContext.xml");
		 
		// retrieve bean from spring container
		Coach theCoach = context.getBean("myCoach", Coach.class);
	
		// close the context
		context.close();
	}

}





