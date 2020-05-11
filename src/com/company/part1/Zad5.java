package com.company.part1;

import java.util.Scanner;

//        Zadanie 5
//        Napisz program, który odczytuje 2 liczby całkowite i na ekran wypisuje ich sumę.
public class Zad5 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int howMuch = 2;
        int number;
        int sum = 0;

        for (int i = 0; i < howMuch; i++) {
            System.out.println("Give me a number: ");
            number = in.nextInt();
            sum += number;
        }

        System.out.println("The sum of the numbers is: " + sum);
    }
}
