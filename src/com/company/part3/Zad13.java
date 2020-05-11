package com.company.part3;

import java.util.Scanner;

//        Zadanie 13
//        Sprawdź czy liczba wprowadzona jest podzielna przez 3 lub 5.
//
public class Zad13 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Give me a number:");
        int number = in.nextInt();

        if (number % 3 == 0 || number % 5 == 0) {
            System.out.println("The number is divisible by 3 or 5");
        } else {
            System.out.println("The number isn't divisible by 3 and 5");
        }
    }
}
