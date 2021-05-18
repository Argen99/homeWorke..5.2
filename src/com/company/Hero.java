package com.company;

public class Hero {
    private int health;
    private int damage;
    private String superDamage;

    public Hero(int health, int damage) {
        this.health = health;
        this.damage = damage;
    }
    public Hero(int health, int damage, String superDamage) {
        this.health = health;
        this.damage = damage;
        this.superDamage = superDamage;
    }

    public int getHealth() {
        return health;
    }

    public int getDamage() {
        return damage;
    }

    public String getSuperDamage() {
        return superDamage;
    }
}
