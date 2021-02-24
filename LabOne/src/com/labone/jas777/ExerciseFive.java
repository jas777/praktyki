package com.labone.jas777;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ExerciseFive {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj liczbę od 1 do 7");

        int day = 0;

        try {

            day = scanner.nextInt();

            if (day < 1 || day > 7)
                throw new InputMismatchException();

            String[] days = {
                    "Poniedziałek",
                    "Wtorek",
                    "Środa",
                    "Czwartek",
                    "Piątek",
                    "Sobota",
                    "Niedziela"
            };

            System.out.println(days[day - 1]);

        } catch (InputMismatchException ignored) {
            System.out.println("Podano nieprawidłowe dane");
        }
    }

}
