package com.company.part1;

import java.util.Random;

//        Zadanie 11
//        Napisz program, który losuje liczbę losową z przedziału 1..100.
public class Zad11 {

    public static void main(String[] args) {

        Random random = new Random();
        System.out.println(random.nextInt(100)+1);
    }


}
