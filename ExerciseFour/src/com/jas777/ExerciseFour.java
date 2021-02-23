package com.jas777;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExerciseFour {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double a = 0, b = 0, c = 0;

        try {

            System.out.println("Proszę podać bok a");
            a = scanner.nextDouble();

            System.out.println("Proszę podać bok b");
            b = scanner.nextDouble();

            System.out.println("Proszę podać bok c");
            c = scanner.nextDouble();

        } catch (InputMismatchException ignored) {
            System.out.println("Podano nieprawidłowe dane");
        }

        if ((a + b) > c && (b + c) > a && (c + a) > b)
            System.out.println("tak");
        else System.out.println("nie");


    }

}
