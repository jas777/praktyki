package com.labthree.jas777;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ExerciseTwo {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj wielkość tablicy");

        try {

            int arrSize = scanner.nextInt();

            int[] numbers = new int[arrSize];

            System.out.println("Podaj pierwszą liczbę");
            int firstNum = scanner.nextInt();

            numbers[0] = firstNum;

            boolean finished = false;

            int currentNumber = firstNum;
            int currentIndex = 1;

            while (!finished) {

                if (currentIndex == arrSize - 1) {
                    finished = true;
                }

                if (firstNum % 2 == 0)
                    numbers[currentIndex++] = currentNumber += 2;
                else {
                    numbers[currentIndex++] = currentNumber += 1;
                    firstNum++;
                }

            }

            for (int number : numbers) {
                System.out.print(number + " ");
            }

            System.out.println();

            System.out.println(
                    "min     : " + min(numbers) + "\n" +
                            "max     : " + max(numbers) + "\n" +
                            "suma    : " + sum(numbers) + "\n" +
                            "średnia : " + avg(numbers) + "\n" +
                            "mediana : " + median(numbers) + "\n"
            );

        } catch (InputMismatchException ignored) {
            System.out.println("Podano nieprawidłowe dane");
        }


    }

    public static int min(int[] numbers) {

        OptionalInt possibleInt = Arrays.stream(numbers).min();

        assert possibleInt.isPresent();

        return possibleInt.getAsInt();

    }

    public static int max(int[] numbers) {

        OptionalInt possibleInt = Arrays.stream(numbers).max();

        assert possibleInt.isPresent();

        return possibleInt.getAsInt();

    }

    public static int sum(int[] numbers) {

        return Arrays.stream(numbers).sum();

    }

    public static double avg(int[] numbers) {

        double numberSum = sum(numbers);

        return numberSum / numbers.length;

    }

    public static double median(int[] numbers) {

        if (numbers.length % 2 == 0) {
            return (double) (numbers[(numbers.length / 2) - 1] +
                    numbers[(numbers.length / 2)]) / 2;
        } else {
            return numbers[(numbers.length / 2)];
        }

    }

}
