package com.company.part3;

import java.util.Scanner;

//        Zadanie 14
//        Odczytaj wiek osoby i sprawdź czy osoba jest pełnoletnia czy niepełnoletnia.
//
public class Zad14 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("What's your age: ");
        int age = in.nextInt();

        if (age > 18) {
            System.out.println("You are of legal age");
        } else {
            System.out.println("You aren't of legal age");
        }
    }


}
