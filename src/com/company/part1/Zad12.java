package com.company.part1;

import java.util.Arrays;
import java.util.Scanner;

//        Zadanie 12
//        Napisz program, który odczytuje 2 zmienne całkowite i zamienia ich wartości.
public class Zad12 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int howMuch = 2;
        int number;
        int[] table = new int[howMuch];


        for (int i = 0; i < howMuch; i++) {
            System.out.println("Give me a number: ");
            number = in.nextInt();
            table[i] = number;
        }

        for (int i = howMuch - 1; i >= 0; i--) {
            System.out.println("The number " + (howMuch - i) + " is " + table[i]);
        }


    }
}
