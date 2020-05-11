package com.company.part2;

import java.util.Scanner;

//        Zadanie 1. Napisz program, który odczytuje 2 wyrazy i wypisuje je w odwrotnej kolejności.
//
//                Dane:
//        Adam Kowalski
//
//        Na ekran:
//        Kowalski Adam

public class Zad1 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int howMuch = 2;
        String[] table = new String[howMuch];

        for (int i = 0; i < howMuch; i++) {
            System.out.println("Enter the word: ");
            String word = in.next();
            table[i] = word;
        }

        for (int i = howMuch - 1; i >= 0; i--) {
            System.out.print(table[i] + " ");
        }
    }
}
