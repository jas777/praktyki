package com.labthree.jas777;

public class ExerciseFive {

    public static void main(String[] args) {
        System.out.println(gcd(144, 12));
    }

    public static int gcd (int a, int b) {
        if (b == 0)
            return a;
        else
            return gcd (b, a % b);
    }

}
