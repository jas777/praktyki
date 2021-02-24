package com.labone.jas777;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ExerciseSix {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        ArrayList<Double> numbers = new ArrayList<>();

        try {

            System.out.println("Proszę podać a");
            numbers.add(scanner.nextDouble());

            System.out.println("Proszę podać b");
            numbers.add(scanner.nextDouble());

            System.out.println("Proszę podać c");
            numbers.add(scanner.nextDouble());

        } catch (InputMismatchException ignored) {
            System.out.println("Podano nieprawidłowe dane");
        }

        numbers.stream()
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.toList())
                .forEach(System.out::println);

    }

}
