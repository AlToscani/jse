package com.example.jse.m02.s12.ex;

public class Exercise4 {
	public static void main(String[] args) {
		/*
		 * TODO: print up to 3 args
		 * 
		 * ["ciao", "hello"] -> "ciao" "hello"
		 * 
		 * ["ciao", "hello", "ciao", "hello"] -> "ciao" "hello", "ciao"
		 */

//		
//		for (int i = 0; i < args.length; i++) {
//			System.out.println(args[i]);
//			if (i == 2) {
//				System.out.println("no more print for u, bye");
//				break;
//			}
//		}
//		
		int len = args.length < 3 ? args.length : 3;
		for (int i = 0; i < len; i++) {
			System.out.println(args[i]);
		}
	}
}
