package com.labfive.jas777.battlesim;

public class Util {

    public static double getAttacModifier(CharacterClass characterClass) {
        switch (characterClass) {
            case AXE -> {
                return 0.7;
            }
            case SPEAR -> {
                return 0.1;
            }
            default -> {
                return 1;
            }
        }
    }

    public static double getDefenseModifier(CharacterClass characterClass) {
        switch (characterClass) {
            case AXE -> {
                return 0.3;
            }
            case SPEAR -> {
                return 0.5;
            }
            default -> {
                return 1;
            }
        }
    }

    public static void clear() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

}
