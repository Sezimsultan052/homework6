package com.company;

public class GameEntity {
    private int health;
    private int damage;
    private String attackType;

    public GameEntity(int health, int damage, String attackType) {
        this.health = health;
        this.damage = damage;
        this.attackType = attackType;
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

    public String getAttackType() {
        return attackType;
    }

    public void setAttackType(String attackType) {
        this.attackType = attackType;
    }
}
