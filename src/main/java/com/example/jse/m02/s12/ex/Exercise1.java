package com.example.jse.m02.s12.ex;

public class Exercise1 {
    public static void main(String[] args) {
        // TODO: print all values in [0 .. 9]
        // (1) for loop
    	System.out.println("Printing with for:");
    	for (int i=0;i<10;i++) {
    		System.out.println(i);
    	}
        // (2) while loop
    	int i = 0;
    	System.out.println("printing with while:");
    	while(i<10) {
    		System.out.println(i);
    		i++;
    	}
        // (3) do-while loop
    	int j=0;
    	System.out.println("now printing with do-while:");
    	do {
    		System.out.println(i);
    		j++;
    	} while(j<10);
    }
}
