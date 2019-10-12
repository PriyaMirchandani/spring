package com.zensar.spring.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.zensar.spring.performers.Performer;

public class ZensarIdolMain {
  public static void main(String[] args) {
	  ApplicationContext ac= new ClassPathXmlApplicationContext("Performer.xml");
	  Performer p1=ac.getBean("Zakir Hussain", Performer.class)   ; 
	  p1.perform();
	  Performer p2=ac.getBean("priya", Performer.class)   ;
      p2.perform();
      Performer p3=ac.getBean("aditi", Performer.class)   ;
      p3.perform();
}
}
