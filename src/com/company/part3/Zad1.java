package com.company.part3;

import java.util.Scanner;

public class Zad1 {
    public static void main(String[] args) {
//        Zadanie 1
//        Napisz program, który sprawdzi czy wprowadzona liczba jest większa od 5.

        System.out.println("Give me a number: ");
        Scanner in = new Scanner(System.in);
        int limit = 5;
        int number = in.nextInt();

        if (number > limit) {
            System.out.println("The number " + number + " is greater than " + limit);
        } else {
            System.out.println("The number " + number + " is less than " + limit);
        }
    }
}
