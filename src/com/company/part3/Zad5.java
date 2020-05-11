package com.company.part3;

import java.util.Scanner;

//        Zadanie 5
//        Popraw dany kod, aby wypisywał liczbę największą, a nie najmniejszą.
//
public class Zad5 {
    public static void main(String[] args) {
                Scanner scanner = new Scanner(System.in);
                int a = scanner.nextInt();
                int b = scanner.nextInt();
                //int min = a<b ? a : b;
                //System.out.println(min);

                int max = a>b ? a : b;
                System.out.println(max);

    }

}

