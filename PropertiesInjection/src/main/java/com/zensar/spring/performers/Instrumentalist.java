package com.zensar.spring.performers;


import java.util.Enumeration;
import java.util.Map;
import java.util.Properties;



public class Instrumentalist implements Performer {

	private Properties instrumentSongProps;

	public Properties getInstrumentSongProps() {
		return instrumentSongProps;
	}
	public void setInstrumentSongProps(Properties instrumentSongProps) {
		this.instrumentSongProps = instrumentSongProps;
	}

	@Override
	public void perform() {
		System.out.println("intrumentalist is playing songs");
		Enumeration instruments=instrumentSongProps.keys();
		while (instruments.hasMoreElements())
		{
			String piano = (String) instruments.nextElement();
			String song  =  instrumentSongProps.getProperty(piano);
			System.out.println(song+" by "+piano);
			
		}
		
	}

	
}
