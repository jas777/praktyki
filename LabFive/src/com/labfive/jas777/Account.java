package com.labfive.jas777;

public class Account {

    private final long id;

    private long balance = 100;

    public Account(int id) {
        this.id = id;
    }

    public long getBalance() {
        return balance;
    }

    public void setBalance(long balance) {
        this.balance = balance;
    }

    public long getId() {
        return id;
    }
}
