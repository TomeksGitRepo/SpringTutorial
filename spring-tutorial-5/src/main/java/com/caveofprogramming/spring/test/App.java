package com.caveofprogramming.spring.test;

import java.io.IOException;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	public static void main(String[] args) throws IOException {
		
		ApplicationContext context  = new ClassPathXmlApplicationContext("com/caveofprogramming/spring/test/beans/beans.xml");
		
		Logger logger = (Logger)context.getBean("logger");
		
		logger.writeConsole("Hello there");
		logger.writeFile("Hi again");
		
		((ClassPathXmlApplicationContext)context).close();

	}

}
