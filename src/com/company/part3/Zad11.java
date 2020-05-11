package com.company.part3;

import java.util.Scanner;

//        Zadanie 11
//        Odczytaj dane słowo sprawdź czy słowo zawiera wyraz kajak.
//
//
public class Zad11 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Give me a word: ");
        String word = in.next();
        String password = "kajak";

        if (word.contains(password)) {
            System.out.println("Word " + word + " contains " + password);
        } else {
            System.out.println("Word " + word + " not contains " + password);
        }
    }
}
