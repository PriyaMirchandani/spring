package com.zensar.spring.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.zensar.spring.performers.Performer;

public class ZensarIdolMain {
  public static void main(String[] args) {
	  ApplicationContext ac= new ClassPathXmlApplicationContext("Performer.xml");
	  Performer p=ac.getBean("Zakir Hussain",Performer.class );
	  p.perform();
}
}