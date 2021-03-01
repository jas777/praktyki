package com.labfive.jas777.battlesim;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        new Main();
    }

    private final Scanner scanner;

    private Player player;
    private Opponent opponent;

    private int turnIndex = -1;

    public Main() {
        this.scanner = new Scanner(System.in);
        gameInit();
    }

    private void gameInit() {

        this.player = new Player();
        this.opponent = new Opponent();

        Util.clear();

        System.out.println(
                "---------- Wybierz klasę gracza ----------\n" +
                "\n" +
                "1 - Rycerz z siekierą ( +0.7 atak, +0.3 obrona )\n" +
                "2 - Rycerz z dzidą ( +0.3 atak, +1 obrona )\n"
        );

        try {

            int chosen = scanner.nextInt();

            if (chosen > 2 || chosen < 1)
                throw new InputMismatchException();

            player.setCharacterClass(CharacterClass.values()[chosen - 1]);

        } catch (InputMismatchException ignored) {
            System.out.println("Invalid data!");
        }

        Util.clear();

        System.out.println(
                "---------- Wybierz klasę przeciwnika ----------\n" +
                "\n" +
                "1 - Rycerz z siekierą ( +0.7 atak, +0.3 obrona )\n" +
                "2 - Rycerz z dzidą ( +0.3 atak, +1 obrona )\n"
        );

        try {

            int chosen = scanner.nextInt();

            if (chosen > 2 || chosen < 1)
                throw new InputMismatchException();

            opponent.setCharacterClass(CharacterClass.values()[chosen - 1]);

        } catch (InputMismatchException ignored) {
            System.out.println("Invalid data!");
        }

        Util.clear();

        System.out.println(
                "---------- Wybierz zbroję gracza ----------\n" +
                "\n" +
                "1 - Z kolcami ( -0.5 siły / ruch )\n" +
                "2 - Bez kolców ( siła bez zmian )\n"
        );

        try {

            int chosen = scanner.nextInt();

            if (chosen > 2 || chosen < 1)
                throw new InputMismatchException();

            player.setArmorType(ArmorType.values()[chosen - 1]);

        } catch (InputMismatchException ignored) {
            System.out.println("Invalid data!");
        }

        Util.clear();

        System.out.println(
                "---------- Wybierz zbroję przeciwnika ----------\n" +
                "\n" +
                "1 - Z kolcami ( -0.5 siły / ruch )\n" +
                "2 - Bez kolców ( siła bez zmian )\n"
        );

        try {

            int chosen = scanner.nextInt();

            if (chosen > 2 || chosen < 1)
                throw new InputMismatchException();

            opponent.setArmorType(ArmorType.values()[chosen - 1]);

        } catch (InputMismatchException ignored) {
            System.out.println("Invalid data!");
        }

        gameLoop();

    }

    private void gameLoop() {

        Util.clear();

        if (opponent.getHealth() < 1) {
            System.out.println("The player wins");
            return;
        } else if (player.health < 1) {
            System.out.println("The opponent wins");
            return;
        }

        turnIndex++;

        if (turnIndex % 2 == 0) {
            turn(player, opponent);
        } else {
            turn(opponent, player);
        }

    }

    private void turn(Player player, Player opponent) {
        System.out.println(player.getCharacterClass().getArt());

        System.out.println(
                (turnIndex % 2 == 0 ? "\n\nGracz\n" : "\n\nPrzeciwnik\n") +
                "HP   : " + player.getHealth() + "\n" +
                "Siła : " + player.getStamina() + "\n" +
                "\n" +
                "1 - Atak\n" +
                "2 - Czekaj (regeneruje siłę)\n"
        );

        try {

            int chosen = scanner.nextInt();

            if (chosen > 2 || chosen < 1)
                throw new InputMismatchException();

            if (chosen == 1) {

                Random random = new Random();

                double damage = random.nextInt(player.getWeaponType().getMaxDamage() - 1) + 1;

                damage += Util.getAttacModifier(player.getCharacterClass()) * damage *
                          player.getWeaponType().getAttack();

                damage -= Util.getDefenseModifier(opponent.getCharacterClass()) * damage *
                          opponent.getWeaponType().getDefense();

                damage *= (double) player.getStamina() / 100;

                opponent.setHealth(opponent.getHealth() - damage);

                player.setStamina(player.getStamina() - 2 - player.getArmorType().getStaminaModifier());

            } else {

                player.setStamina(Math.min(player.getStamina() + 5, 100));

            }

        } catch (InputMismatchException ignored) {
            System.out.println("Invalid data!");
        }
        gameLoop();
    }

}
