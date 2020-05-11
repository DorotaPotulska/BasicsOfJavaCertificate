package com.company.part3;

import java.lang.ref.SoftReference;
import java.util.Scanner;

//        Zadanie 6
//        Napisz kod, który odczytuje 3 liczby i wypisuje na ekran najmniejszą z nich.
//
public class Zad6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int howMuch = 3;
        int number;
        int smallest = 0;


        for (int i = 0; i < howMuch; i++) {
            System.out.println("Give me a number: ");
            number = in.nextInt();

            if (i == 0) {
                smallest = number;
            } else if (smallest > number) {
                smallest = number;
            }

        }

        System.out.println("The smallest number is " + smallest);

//        Scanner scanner = new Scanner(System.in);
//
//        // 5 1 10
//        int a = scanner.nextInt();
//        int b = scanner.nextInt();
//        int c = scanner.nextInt();
//        int min = a<b ? a : b;
//        // min = 1
//
//        if ( c < min ){
//            System.out.println(c);
//        }
//        else{
//            System.out.println(min);
//        }
    }

}

