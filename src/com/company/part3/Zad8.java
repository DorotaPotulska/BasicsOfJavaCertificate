package com.company.part3;

import java.util.Scanner;

//        Zadanie 8
//        Odczytaj wprowadzony wyraz przez użytkownika i sprawdź czy pierwsza litera wyrazu jest taka sama jak ostatnia.
//        Wpisz odpowiedni komunikat.
//
public class Zad8 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter the word: ");
        String word = in.next();

        if (word.toLowerCase().charAt(0) == word.toLowerCase().charAt(word.length() - 1)) {
            System.out.println("The first and last letter are the same");
        } else {
            System.out.println("The first and last letter aren't the same");
        }
    }
}
