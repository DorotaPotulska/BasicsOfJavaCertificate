package com.company.part3;

import java.util.Scanner;

//
//        Zadanie 2
//        Napisz program, który sprawdza czy dana wprowadzona liczba jest podzielna przez 3.
//
public class Zad2 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int number = 3;
        System.out.println("Give me a number: ");
        int myNumber = in.nextInt();

        if (myNumber % number == 0) {
            System.out.println("The number is divisible by " + number);
        } else {
            System.out.println("The number isn't divisible by " + number);
        }
    }
}
