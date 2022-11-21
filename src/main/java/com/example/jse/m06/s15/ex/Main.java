package com.example.jse.m06.s15.ex;

/**
 * Create a hierarchy of classes based on Actor
 * <p>
 * Warrior: could fight, can't do any magic
 * <p>
 * Wizard: can't fight, could do magic
 * 
 * <p>
 * In the main
 * <p>
 * Create a bunch of actors
 * <p>
 * Let them fight against each others
 * <p>
 * Peer-to-peer fight, the most skilled one wins
 * <p>
 * Wizards always beat warriors
 * <p>
 * In the end, let the user knows who survived
 */
public class Main {
    public static void main(String[] args) {
        Actor[] actors = { new Warrior("Garen", 25), new Warrior("Darius", 30), 
        		new Warrior ("Jhin", 44), new Wizard("Swain", 50), new Wizard("Xerath", 20)};

        for (Actor actor : actors) {
            System.out.println(actor);
        }

        System.out.println("Let's fight ...");
        for (int i=0, j=1; i<actors.length; i++,j++) {
            System.out.println("Attacker " + actors[i]);
            System.out.println("Enemy " + actors[j]);
            if(j==actors.length-1) {
            	j=0;
            }
            if (actors[i].fight(actors[j])) {
            	System.out.println(actors[i].getName() + " wins!");
            } else {
            	System.out.println(actors[j].getName() + " wins!");
            }
        }
    }
}
