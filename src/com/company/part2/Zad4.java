package com.company.part2;

import java.util.Scanner;

//        Zadanie 4. Napisz program, który odczytuje wyraz i zamienia go na małe litery:
//
//        Dane:
//        AKADEMIA
//
//        Wynik:
//        akademia
//
public class Zad4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter the word:");
        String word = in.next();

        System.out.println("This word it " + word.toLowerCase());
    }
}
