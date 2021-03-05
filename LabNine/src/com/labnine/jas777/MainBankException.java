package com.labnine.jas777;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MainBankException {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Czy chcesz stworzyc konto ?");

        boolean doCreateAccount = getYesNoAnswer();

        if (!doCreateAccount) {
            endProgram();
        }

        Account account = createNewAccount();

        System.out.println("Czy chcesz wyplacic pieniadze?");

        boolean shouldWithdrawMoney = getYesNoAnswer();

        if (!shouldWithdrawMoney) {
            endProgram();
        }

        System.out.println("Ile chcesz wyplacic ?");

        int amount = getAmount();

        try {
            account.withdraw(amount);
        } catch (InsufficientFundsException exception) {
            System.out.println(exception.getMessage());
            main(new String[0]);
        }

        System.out.printf("Dziekujemy za skorzystanie z serwisu. Twoj stan konta to: %.2f $", account.getBalance());
        System.out.println();

    }

    private static Account createNewAccount() {

        System.out.println("Jak masz na imie ?");

        String name = null;

        try {

            name = scanner.nextLine();

            if (name.isBlank())
                throw new InputMismatchException();

        } catch (InputMismatchException exception) {

            System.out.println("Nieprawidłowe dane!");
            main(new String[0]);

        }

        System.out.println("Ile srodkow chcesz dodac do swojego konta?");

        int initialAmount = getAmount();

        return new Account(name, initialAmount);

    }

    private static void endProgram() {
        System.out.println("Dziekujemy za korzystanie z serwisu");
        System.exit(0);
    }

    private static int getAmount() {

        int amount = 0;

        try {

            amount = Integer.parseInt(scanner.nextLine());

        } catch (NumberFormatException exception) {

            System.out.println("Nieprawidłowe dane!");
            main(new String[0]);

        }

        return amount;

    }

    private static boolean getYesNoAnswer() {

        String userAnswer = null;

        try {

            userAnswer = scanner.nextLine();

        } catch (NumberFormatException exception) {

            System.out.println("Nieprawidłowe dane!");
            main(new String[0]);

        }

        assert userAnswer != null;

        if (userAnswer.toLowerCase().contains("tak"))
            return true;

        else if (userAnswer.toLowerCase().contains("nie"))
            return false;

        else {
            System.out.println("Napisz tak lub nie");
            return getYesNoAnswer();
        }

    }
}