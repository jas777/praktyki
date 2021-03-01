package com.labfive.jas777.battlesim;

public enum ArmorType {

    WITH_SPIKES(0.5),
    WITHOUT_SPIKES(0);

    private final double staminaModifier;

    ArmorType(double staminaModifier) {
        this.staminaModifier = staminaModifier;
    }

    public double getStaminaModifier() {
        return staminaModifier;
    }
}
