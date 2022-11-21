package com.example.jse.m06.s15.ex;

public class Wizard extends Actor {

	public Wizard(String name, int abilityPower) {
		super(name, 0, abilityPower);
	}
	
	@Override
	public boolean fight(Actor enemy) {
		if (enemy instanceof Wizard) {
			if (this.getAbilityPower()<enemy.getAbilityPower()) {
				return false;
			}
		}
		return true;
	}

	@Override
	public String toString() {
		return super.toString()+" Total AP:" + getAbilityPower();
	}

}
