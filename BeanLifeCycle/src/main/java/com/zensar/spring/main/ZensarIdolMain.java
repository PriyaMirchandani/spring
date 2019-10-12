package com.zensar.spring.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ZensarIdolMain {
  public static void main(String[] args) {
	  ApplicationContext ac= new ClassPathXmlApplicationContext("Performer.xml");
	  
}
}
