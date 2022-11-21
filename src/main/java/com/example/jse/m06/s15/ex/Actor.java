package com.example.jse.m06.s15.ex;

public abstract class Actor {
	private int abilityPower;
	private int attackDamage;
    private String name;

    protected Actor(String name, int attackDamage, int abilityPower) {
        this.name = name;
        this.attackDamage=attackDamage;
        this.abilityPower=abilityPower;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public abstract boolean fight(Actor enemy);

    @Override
    public String toString() {
        return "Actor [name=" + name + "]";
    }

	public int getAbilityPower() {
		return abilityPower;
	}

	public void setAbilityPower(int abilityPower) {
		this.abilityPower = abilityPower;
	}

	public int getAttackDamage() {
		return attackDamage;
	}

	public void setAttackDamage(int attackDamage) {
		this.attackDamage = attackDamage;
	}
    
}
