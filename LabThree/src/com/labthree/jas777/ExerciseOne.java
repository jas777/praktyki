package com.labthree.jas777;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExerciseOne {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        try {

            System.out.println("Podaj wielkość tablicy");
            int size = scanner.nextInt();

            if (size < 1)
                throw new InputMismatchException();

            char[] chars = new char[size];

            for (int i = 0; i < chars.length; i++) {

                System.out.println("Podaj znak nr. " + (i + 1));

                String input = scanner.next();

                chars[i] = input.charAt(0);

            }

            for (char aChar : chars) {
                System.out.print(aChar + ", ");
            }

        } catch (InputMismatchException ignored) {
            System.out.println("Podano nieprawidłowe dane");
        }

    }

}
