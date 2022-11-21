package com.example.jse.m06.s11.ex;

import java.util.logging.Logger;

public class Flat implements Conditioning {
    private static final Logger log = Logger.getGlobal();
    @SuppressWarnings("unused")
	private int temperature;

    public Flat() {
    	this.temperature = 10;
        log.info("Flat created");
    }
    
    @Override
    public String toString() {
        return "a Flat";
    }

	@Override
	public void setConditionging(int temperature) {
		this.temperature=temperature;
	}
}
