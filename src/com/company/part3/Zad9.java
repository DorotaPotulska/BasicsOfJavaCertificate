package com.company.part3;
//        Zadanie 9
//        Odczytaj 2 wyrazy i sprawdź czy wprowadzone wyrazy są równe.
//        Dla wywołania:
//        Ala Ala
//        Wynikiem powinno być tak.
//        Dla wywołania:
//        Ala Sak
//        Wynikiem powinno być nie.
//

import java.util.Scanner;

public class Zad9 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter the word: ");
        String wordOne = in.next();


        System.out.println("Enter the word: ");
        String wordTwo = in.next();

        if (wordOne.equalsIgnoreCase(wordTwo)) {
            System.out.println("The words are the same");
        } else {
            System.out.println("The words aren't the same");
        }
    }
}
