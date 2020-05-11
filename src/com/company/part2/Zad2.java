package com.company.part2;

import java.util.Scanner;

//
//        Zadanie 2. Napisz program, który odczytuje imię i wypisuje długość wprowadzonego imienia:
//
//        Dane:
//        Piotr
//
//        Na ekran:
//        5
//
public class Zad2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter name: ");
        String name = in.next();

        System.out.println("Name length is " + name.length());
    }
}
