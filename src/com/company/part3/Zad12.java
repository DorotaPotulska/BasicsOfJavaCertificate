package com.company.part3;

import java.util.Scanner;

// Zadanie 12
//​Napisz program, który sprawdza czy wprowadzony wyraz jest kodem pocztowym. Kod pocztowy musi być w formacie 87-630.
//
public class Zad12 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Give me a postal code: ");
        String postalCode = in.next();

        System.out.println(postalCode.matches("^[0-9]{2}-[0-9]{3}$"));


    }
}
