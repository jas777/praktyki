package com.labeight.jas777;

public class ExerciseTwo {

    public static void main(String[] args) {

        BankA bankA = new BankA();
        BankB bankB = new BankB();
        BankC bankC = new BankC();

        System.out.println(bankA.getBalance() + " USD");
        System.out.println(bankB.getBalance() + " USD");
        System.out.println(bankC.getBalance() + " USD");

    }

}
