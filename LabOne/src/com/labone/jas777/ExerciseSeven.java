package com.labone.jas777;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExerciseSeven {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // #1

        double x1 = 0, y1 = 0;

        try {

            System.out.println("Podaj x1");
            x1 = scanner.nextDouble();

            System.out.println("Podaj y1");
            y1 = scanner.nextDouble();

        } catch (InputMismatchException ignored) {
            System.out.println("Podano nieprawidłowe dane");
        }

        // #2

        double x2 = 0, y2 = 0;

        try {

            System.out.println("Podaj x2");
            x2 = scanner.nextDouble();

            System.out.println("Podaj y2");
            y2 = scanner.nextDouble();

        } catch (InputMismatchException ignored) {
            System.out.println("Podano nieprawidłowe dane");
        }

        // Pitagoras

        double a = x1 - x2;
        double b = y1 - y2;

        double c = Math.pow(a, 2) + Math.pow(b, 2);

        double distance = Math.sqrt(c);

        System.out.println(distance);

    }

}
