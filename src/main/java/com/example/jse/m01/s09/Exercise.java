package com.example.jse.m01.s09;

public class Exercise {
    public static void main(String[] args) {
        // (1) create an array with "one", "two", "three", "four" in it
        // (2) print the number of its elements
        // (3) print the last element
    	String[] vettoreParole = {"one", "two", "three", "four"};
    	
    	System.out.println(vettoreParole.length);
//    	for(int i=0; i < vettoreParole.length; i++) {
//    		//ciclo per stampare array Arrays.toString
//    		
//    		System.out.println(vettoreParole[i]);	
//    	}
    	System.out.println(vettoreParole[vettoreParole.length - 1]);
    	System.out.print("forse è ");
        System.out.println("Done");
    }
}
