package com.company;

public class Boss extends GameEntity{
        private Weapon bossWeapon;

    public Boss(int health, int damage, String attackType, Weapon bossWeapon) {
        super(health, damage, attackType);
        this.bossWeapon = bossWeapon;
    }

    public Weapon getBossWeapon() {
        return bossWeapon;
    }

    public void setBossWeapon(Weapon bossWeapon) {
        this.bossWeapon = bossWeapon;
    }
}
