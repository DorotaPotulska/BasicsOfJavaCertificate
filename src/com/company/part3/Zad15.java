package com.company.part3;

import java.util.Scanner;

//        Zadanie 15
//        Odczytaj 3 liczby i sprawdź czy jest możliwe otrzymanie z dwóch liczb trzeciej (jako suma).
//
public class Zad15 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int howMuch = 3;
        int number;
        int[] tabNumber = new int[howMuch];
        for (int i = 0; i < howMuch; i++) {
            System.out.println("Give me a number: ");
            number = in.nextInt();
            tabNumber[i] = number;
        }

        if (tabNumber[0] == tabNumber[1] + tabNumber[2] || tabNumber[1] == tabNumber[0] + tabNumber[2]
                || tabNumber[2] == tabNumber[0] + tabNumber[1]) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }
    }
}
