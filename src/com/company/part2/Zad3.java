package com.company.part2;

import java.util.Scanner;

//        Zadanie 3. Napisz program, który odczytuje wyraz i sprawdza czy wprowadzony wyraz to Akademia
//
//        Dane:
//        Akademia
//        Na ekran:
//        true
//
//        Dane2:
//        Akademi
//
//        Na ekran:
//        false
//
public class Zad3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String password = "Akademia";
        System.out.println("Enter the password:");
        String word = in.next();

        if (word.equalsIgnoreCase(password)) {
            System.out.println("You have entered the correct password");

        } else {
            System.out.println("You haven't entered the correct password");
        }

    }
}
