package com.company.part3;

import java.util.Scanner;

//        Zadanie 4
//        Napisz program, który odczytuje wyraz i sprawdza czy wprowadzone imię jest męskie czy żeńskie.
//
public class Zad4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Give me the name: ");
        String name = in.next();

        if (name.endsWith("a")&&
                !name.equals("Kosma") && !name.equals("Kuba")) {
            System.out.println("The given name is feminine");
        } else {
            System.out.println("The given name is male");
        }
    }
}
