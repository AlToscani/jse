package com.example.jse.m06.s15.ex;

public class Warrior extends Actor {

	public Warrior(String name, int attackDamage) {
		super(name, attackDamage, 0);
	}

	@Override
	public boolean fight(Actor enemy) {
		if (enemy instanceof Warrior) {
			if (this.getAttackDamage() >= enemy.getAttackDamage()) {
				return true;
			}
		}
		return false;
	}

	@Override
	public String toString() {
		return super.toString() + " Total AD:" + getAttackDamage();
	}

}
