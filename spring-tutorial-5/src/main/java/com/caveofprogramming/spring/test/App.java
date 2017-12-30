package com.caveofprogramming.spring.test;

import java.io.IOException;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.CannotGetJdbcConnectionException;

public class App {

	public static void main(String[] args) throws IOException {
		
		ApplicationContext context  = new ClassPathXmlApplicationContext("com/caveofprogramming/spring/test/beans/beans.xml");
		
		
		
		OffersDAO offersDao = (OffersDAO)context.getBean("offersDao");
		
		try {
			offersDao.delete(3);
			List<Offer> offers = offersDao.getOffers();
			
			for (Offer offer: offers) {
				System.out.println(offer);
			}
			
			Offer offer = offersDao.getOffer(2);
			
			System.out.println("Should be Mike: " + offer);
		} 
		catch( CannotGetJdbcConnectionException ex) {
			System.out.println("Cannot get database connecion.\n");
		} 
		catch (DataAccessException ex) {
			System.out.println(ex.getMessage());
			System.out.println(ex.getClass());
		}
		
		
		
		
		((ClassPathXmlApplicationContext)context).close();

	}

}
