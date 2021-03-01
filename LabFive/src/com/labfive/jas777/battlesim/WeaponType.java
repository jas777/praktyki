package com.labfive.jas777.battlesim;

public enum WeaponType {

    AXE(1.5, 0.9, 10),
    SPEAR(1.3, 1.3, 7);

    private final double attack;
    private final double defense;

    private final int maxDamage;

    WeaponType(double attack, double defense, int maxDamage) {
        this.attack = attack;
        this.defense = defense;
        this.maxDamage = maxDamage;
    }

    public double getAttack() {
        return attack;
    }

    public double getDefense() {
        return defense;
    }

    public int getMaxDamage() {
        return maxDamage;
    }
}
