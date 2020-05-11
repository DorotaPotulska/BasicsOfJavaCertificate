package com.company.part1;

import java.util.Scanner;

//        Zadanie 7
//        Napisz program, który oblicza pole koła.
public class Zad7 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Enter the radius of the circle:");
        int ray = in.nextInt();

        double area100 = Math.round(Math.PI * ray * ray * 100);
        System.out.println("The circle's area is " + area100 / 100);
    }
}
