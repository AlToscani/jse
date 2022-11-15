package com.example.jse.m03.s05.ex;

public class Exercise {
	private static final int GAP = 'a' - 'A'; // charset independent
	private static final int ALPHABET_SIZE = 26; // standard alphabet

	/**
	 * A simpler version of String.toUpperCase()
	 * 
	 * Build the result in a StringBuilder, then convert it to String and return it
	 * 
	 * Do not use any method in String!
	 * 
	 * @param s
	 * @return uppercase version of input
	 */
	public String toUpper(String s) {

		if (s == null || s.isEmpty()) {
			return s;
		}

		StringBuilder result = new StringBuilder("");

		for (int i = 0; i < s.length(); i++) {	//for each con stringhe for(char c : s.toCharArray())
			char c = s.charAt(i);
			if (c >= 'a' && c <= 'z') {
//				c = (char) (c - GAP); //altro modo
				c -= GAP;
			}
			result.append(c);
		}

		return result.toString();
	}

	/**
	 * Encrypt an uppercase string using the Caesar's algorithm
	 * 
	 * @param s     a string (uppercase only)
	 * @param shift encrypting key
	 * @return the encrypted string
	 */
	public String caesarEncrypt(String s, int shift) {

		if (s == null || s.isEmpty()) {
			return s;
		}

		StringBuilder result = new StringBuilder("");

		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			if (c >= 'A' && c <= 'Z') {
				c += (shift % ALPHABET_SIZE);
				if (c < 'A') {
//					c += ALPHABET_SIZE;
					int exceeding = c - 'A';
					c = 'Z' + 1;
					c += exceeding;
				} else if (c > 'Z') {
//					c -= ALPHABET_SIZE;
					int exceeding = c - 'Z';
					c = 'A' - 1;
					c += exceeding;
				}
			}
			result.append(c);
		}
		return result.toString();
	}
}
