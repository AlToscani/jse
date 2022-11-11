package com.example.jse.m01.s10;

import java.util.Arrays;

public class MatrixArraysExercise {
    public static void main(String[] args) {
        // (1) Create a two line matrix
        // Row 1: "ciao", "buongiorno"
        // Row 2: "hello", "good morning"
        // (2) Print the first English greeting
        // (3) Convert the Italian greetings in a string and print it
        // (4) Convert the full matrix in a string and print it
    	
//    	String[][] matrix = new String[2][2] ;
//    	matrix[0][0]= "ciao";
//    	matrix[0][1]= "buongiorno";
//    	matrix[1][0]= "hello";
//    	matrix[1][1] = "good morning";
    	
    	String[][] matrix= {{"ciao", "buongiorno"},{"hello", "good morning"}};
   	
    	System.out.println(matrix[1][0]);
    	
    	System.out.println(Arrays.toString(matrix[0]));
    	
    	System.out.println(Arrays.deepToString(matrix));

        System.out.println("Done");
    }
}
