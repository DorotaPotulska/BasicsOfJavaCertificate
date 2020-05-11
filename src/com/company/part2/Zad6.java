package com.company.part2;
//        Zadanie 6. Odczytaj wyraz i wypisz na ekran wartość true lub false w zależności od tego czy wyraz zawiera w sobie napis kot.


import java.util.Scanner;

public class Zad6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter the word: ");
        String word = in.next();
        System.out.println(word.contains("kot"));
    }
}
