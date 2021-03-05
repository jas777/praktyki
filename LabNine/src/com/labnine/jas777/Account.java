package com.labnine.jas777;

public class Account {

    private String accountName;
    private double balance;

    public Account(String accountName, double initialBalance) {
        this.accountName = accountName;
        this.balance = initialBalance;
    }

    public int withdraw(int amount) throws InsufficientFundsException {

        if (amount > balance)
            throw new InsufficientFundsException("Nie można wypłacić kwoty większej niż bilans konta!");

        balance -= amount;

        return amount;
    }

    public double getBalance() {
        return balance;
    }

}
