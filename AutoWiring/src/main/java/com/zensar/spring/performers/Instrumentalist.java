package com.zensar.spring.performers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import com.zensar.spring.instruments.Instrument;
@Component("pyare mohan")
public class Instrumentalist implements Performer {
	@Autowired
	@Qualifier("piano")
	private Instrument instrument;
	@Value("tara rum pum")
	private String song;
	@Override
	public void perform() {
		System.out.println("instrumentalist is playing a song "+ song);
		instrument.play();

	}

}
