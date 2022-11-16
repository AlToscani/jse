package com.example.jse.m05.s06;

public class Exercise {
	public static void main(String[] args) {
		if (args.length != 1) {
			System.out.println("Pass me one argument!");
		} else {
			System.out.println("Analyzing: '" + args[0] + "'");
			// (1) check if the argument contains only ciphers
			String arg = args[0];
			boolean checkOnlyCipher = true;

			for (int i = 0; i < arg.length(); i++) {
				char c = arg.charAt(i);
				if (!Character.isDigit(c)) {
					System.out.println("This argument doesn't contain only ciphers!");
					checkOnlyCipher = false;
					break;
				}
			}
			if (checkOnlyCipher) {
				System.out.println("This argument contains only ciphers!");
			}

			boolean checkAtLeastOneCipher = false;
			// (2) check if the argument contains at least one cipher
			for (int i = 0; i < arg.length(); i++) {
				char c = arg.charAt(i);
				if (Character.isDigit(c)) {
					if (checkOnlyCipher) {
						System.out.println("And obviously this argument contains at least one cipher! WHAT A SURPRISE!1!11!");
					} else {
						System.out.println("But it contains at least one cipher, how many? check by urself");
					}
					checkAtLeastOneCipher = true;
					break;
				}
			}
			if (!checkAtLeastOneCipher) {
				System.out.println("It doesn't contains cipher AT ALL!");
			}

			System.out.println("And its done");
		}
	}
}
