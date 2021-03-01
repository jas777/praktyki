package com.labfive.jas777;

import java.io.IOException;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ExerciseThree {

    public static void main(String[] args) {

        ArrayList<Account> accounts = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            accounts.add(
                    new Account(i + 1)
            );
        }

        clear();

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter ID (1 - 10) : ");

        try {

            int id = scanner.nextInt();

            if (id < 1 || id > 10)
                throw new InputMismatchException();

            clear();

            showMenu(id, scanner, accounts);

        } catch (InputMismatchException ignored) {
            System.out.println("\nInvalid data!");
        }

    }

    public static void showMenu(int id, Scanner scanner, ArrayList<Account> accounts) {
        System.out.println("\n\n\n---------- Main menu ----------\n" +
                           "1 - Check balance\n" +
                           "2 - Withdraw\n" +
                           "3 - Deposit\n" +
                           "4 - Exit\n\n");

        System.out.print("Choose an option: ");

        Account account = accounts.get(id - 1);

        int option = scanner.nextInt();

        clear();

        long amount = 0;

        switch (option) {
            case 1 -> {
                System.out.println("Balance: " + account.getBalance());
                showMenu(id, scanner, accounts);
            }
            case 2 -> {
                System.out.print("Enter the amount: ");
                amount = scanner.nextLong();
                if (amount > account.getBalance())
                    throw new InputMismatchException();
                account.setBalance(account.getBalance() - amount);
                clear();
                System.out.println("New balance: " + account.getBalance());
                showMenu(id, scanner, accounts);
            }
            case 3 -> {
                System.out.print("Enter the amount: ");
                amount = scanner.nextLong();
                account.setBalance(account.getBalance() + amount);
                clear();
                System.out.println("New balance: " + account.getBalance());
                showMenu(id, scanner, accounts);
            }
            case 4 -> main(new String[0]);
        }
    }

    public static void clear() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

}
