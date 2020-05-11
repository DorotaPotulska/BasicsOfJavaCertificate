package com.company.part1;

import java.util.Scanner;

//        Zadanie 6
//        Napisz program, który odczytuje 2 liczby całkowite i na ekran wypisuje ich iloraz
//        (zmiennoprzecinkowy).
public class Zad6 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int howMuch = 2;
        int number;
        int quotient = 1;

        for (int i = 0; i < howMuch; i++) {
            System.out.println("Give me a number: ");
            number = in.nextInt();
            quotient *= number;
        }

        System.out.println("The quotient of numbers is " + quotient);
    }
}

