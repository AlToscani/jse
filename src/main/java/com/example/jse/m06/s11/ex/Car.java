package com.example.jse.m06.s11.ex;

import java.util.logging.Logger;

public class Car extends Vehicle implements Conditioning{
    private static final Logger log = Logger.getGlobal();
    private int temperature;
    
    @Override
    public String toString() {
        return "a Car";
    }

	public Car() {
        log.info("Car created");
    }
    
	@Override
	public void setConditionging(int temperature) {
		this.temperature=temperature;
	}
}
