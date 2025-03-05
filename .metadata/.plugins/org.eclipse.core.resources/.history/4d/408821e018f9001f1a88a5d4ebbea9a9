package com.entity;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BankMain {

	public static void main(String[] args) {
		
		ApplicationContext ctx = new 
				    ClassPathXmlApplicationContext("config.xml");
		
		        Bank bank = (Bank) ctx.getBean("bank");
		        
		        System.out.println(bank);
	}
}
