package com.company.part1;

import java.util.Scanner;

//        Zadanie 4
//        Napisz program, który odczytuje liczbę całkowitą i wypisuje ostatnią cyfrę liczby.
public class Zad4 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Give me a number: ");
        int liczba = in.nextInt();

        System.out.println("Your number is " + liczba);
        // % - reszta z dzielenia
        // 10 % 3 = 3 * 3 +1
        // 1256 % 10 = 6 - ostatnia cyfra

        System.out.println("The last digit of the number " + liczba + " is " + liczba % 10);

        int lastDigit = liczba % 10;

        System.out.println("The last digit of the number " + liczba + " is " + lastDigit);
    }
}
