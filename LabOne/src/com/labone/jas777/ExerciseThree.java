package com.labone.jas777;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExerciseThree {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Proszę podać temperaturę (C)");

        double celsius = 0;

        try {
            celsius = scanner.nextDouble();
        } catch (InputMismatchException ignored) {
            System.out.println("Podano nieprawidłowe dane");
        }

        double fahrenheit = (9. / 5.) * celsius + 32;

        System.out.println(celsius + " stopnie Celsjusza to " + fahrenheit + " F");

    }

}
