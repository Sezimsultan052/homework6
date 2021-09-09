package com.company;

public class Main {

    public static void main(String[] args) {

        Weapon weapon = new Weapon("weaponType", "weaponName");
        Boss boss = new Boss(15,100,"physical",weapon);

        System.out.println("Health = "+ boss.getHealth() + " Damage= "+ boss.getDamage()+ " attackType= "+ boss.getAttackType()+ " weapon= "+ boss.getBossWeapon());

    }
}
