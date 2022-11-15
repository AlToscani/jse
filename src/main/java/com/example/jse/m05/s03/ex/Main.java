package com.example.jse.m05.s03.ex;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        String[] names = { "Tom", "Bob", "Kit", "Zip", "Kit" };
        String[] colors = { "blue", "green", "yellow", "black", "blue" };

        System.out.println(Arrays.toString(names));
        System.out.println(Arrays.toString(colors));

        Cat[] cats = new Cat[names.length];
        System.out.println(String.format("There are %d cats in the array", cats.length));

        // TODO: (2) initialize the cats array
        // each cat should have name and color from the arrays above
        for (int i=0; i<cats.length;i++) {
        	cats[i] = new Cat(names[i], colors[i]);
        	//System.out.println(cats[i]);
        }

        System.out.println(String.format("Currently there are %d cats in the program", Cat.getCount()));
        //3
        System.out.println("(3)");
        for(Cat k:cats) {
        	k.meow();
        }
        
        // 4
        System.out.println("(4)");
        for(Cat k:cats) {
        	if(k.getName().equals("Kit")) {
        		k.meow();
        	}
        }

        // 5
        System.out.println("(5)");
        for(Cat k:cats) {
        	if(k.getName().equals("Kit")) {
        		k.meow();
        		break;
        	}
        }

        // 6 only the cats in even position should meow
        System.out.println("(6)");
        for (int i=0; i<cats.length;i++) {
        	if(i%2==0) {
        		cats[i].meow();
        	}
        }
    }
}
