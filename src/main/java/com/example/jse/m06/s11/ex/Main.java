package com.example.jse.m06.s11.ex;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Vehicle[] vehicles = {new Car(), new Bus(), new MotorBike()};
        System.out.println(Arrays.toString(vehicles));

        // TODO: (2) let all vehicle steer in alternate directions

        Conditioning[] conditioned = {new Car(), new Bus(), new Flat()};
        System.out.println(Arrays.toString(conditioned));
        
        for(Object object : conditioned) {
        	// object.setConditioning(20);
        }
        // TODO: (4) set the temperature of each conditioned to 20
    }
}
