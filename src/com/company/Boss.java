package com.company;

public class Boss {
    private int health;
    private int damage;
    private String Defence;

    public Boss(int health, int damage, String defence) {
        this.health = health;
        this.damage = damage;
        Defence = defence;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public String getDefence() {
        return Defence;
    }

    public void setDefence(String defence) {
        Defence = defence;
    }
}
