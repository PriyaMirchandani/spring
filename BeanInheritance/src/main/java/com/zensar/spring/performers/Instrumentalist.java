package com.zensar.spring.performers;

import org.springframework.beans.factory.BeanNameAware;

import com.zensar.spring.instruments.Instrument;

public class Instrumentalist implements Performer,BeanNameAware {
     
	private String name;
	private Instrument instrument;
	private String song;
	
	public Instrumentalist() {
		
	System.out.println("instrumentalist is created");
	}
	
	
	public Instrument getInstrument() {
		return instrument;
	}


	public void setInstrument(Instrument instrument) {
		this.instrument = instrument;
		System.out.println("instrument is set");
	}


	public String getSong() {
		return song;
	}


	public void setSong(String song) {
		this.song = song;
		System.out.println("Song is set");
	}


	@Override
	public void perform() {
		/*
		 * System.out.println("instrumentalist is playing a song "); instrument.play();
		 */
		System.out.println("performer is "+name);
		instrument.play();

	}


	@Override
	public void setBeanName(String name) {
		
		this.name=name;
		
	}

}
