package com.zensar.spring.performers;

import java.util.List;
import java.util.Set;

import com.zensar.spring.instruments.Instrument;

public class Instrumentalist implements Performer {


	private String song;
	private Set<Instrument> instruments;
	
	public Instrumentalist() {
		
	System.out.println("instrumentalist is created");
	}
	
	

	public Set<Instrument> getInstruments() {
		return instruments;
	}



	public void setInstruments(Set<Instrument> instruments) {
		this.instruments = instruments;
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
		System.out.println("instrumentalist is playing a song "+ song);
		
		for (Instrument instrument : instruments) {
			
			instrument.play();
		}

	}

}
