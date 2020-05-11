package com.company.part1;

import java.util.Scanner;

//        Zadanie 13
//        Napisz program, który odczytuje 3 zmienne całkowite i pokazuje na ekran średnią z
//        liczb. Zaokrąglij wynik do 2 miejsc po przecinku.
public class Zad13 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int howMuchNumbers = 3;
        int number;
        int sum = 0;

        for (int i = 0; i < howMuchNumbers; i++) {
            System.out.println("Give me a number: ");
            number = in.nextInt();
            sum += number;
        }

        double avg100 = Math.round((sum * 100 / howMuchNumbers));

        System.out.println("The average of the numbers is " + avg100 / 100);
    }
}
