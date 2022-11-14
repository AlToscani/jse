package com.example.jse.m02.s12.ex;

public class Exercise3 {
	public static void main(String[] args) {
		/*
		 * TODO: Print (1) the number of arguments passed to this main (2) each argument
		 */
		System.out.println("the length of args is: " + args.length);
		System.out.println("here's the content:");
		if (args.length != 0) {
			for (String arg : args) {
				System.out.print(arg + ", ");
			}
		}
	}
}
