package com.labthree.jas777;

public class ExerciseFour {

    public static void main(String[] args) {
        // ... ( wiem że nie trzeba, ale jak już mam we wszystkich to lepiej wygląda :) )
    }

    public void printTable(int[][] table) {

        for (int[] ints : table) {
            for (int anInt : ints) {
                System.out.print(anInt + "\t");
            }
            System.out.println();
        }

    }

}
