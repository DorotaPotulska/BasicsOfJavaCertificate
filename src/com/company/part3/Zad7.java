package com.company.part3;

import java.util.Scanner;

//        Zadanie 7 ​
//        Odczytaj wyraz i sprawdź czy ostatnia litera to M bądź m.
//
public class Zad7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Give me a word: ");
        String word = in.next();
        String endMark = "m";

        if (word.toLowerCase().endsWith(endMark)) {
            System.out.println("The word ends with the letter " + endMark);
        } else {
            System.out.println("The word doesn't end with the letter " + endMark);
        }
    }
}
