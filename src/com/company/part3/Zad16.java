package com.company.part3;
//        Zadanie 16
//        Mówimy, że osoba jest w wieku nastolatka jeśli ma pomiędzy 13 a 18 lat.
//        Odczytaj 2 liczby oznaczające wiek dwóch osób,
//        wypisz komunikat TAK jeśli 2 osoby są w wieku nastolatka oraz nie jeśli nie są w odpowiednim wieku.

import java.util.Scanner;

public class Zad16 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("How old are you: ");
        int old1 = in.nextInt();

        System.out.println("How old are you: ");
        int old2 = in.nextInt();

        if (old1 > 13 && old1 < 18 && old2 > 13 && old2 < 18) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
