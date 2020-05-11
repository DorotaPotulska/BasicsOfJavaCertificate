package com.company.part2;

import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.Scanner;

//        Zadanie 5. Napisz program, który odczytuje wyraz i sprawdza czy pierwsza litera to A
//
//        Dane:
//        Adam
//
//        Wynik:
//        true
//
//        Dane2:
//        Piotr
//        Wynik:
//        false
//
public class Zad5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the word:");
        String word = in.next();

        System.out.println(word.toLowerCase().startsWith("a"));
//        String[] tabLetters = word.split("");
//        System.out.println(tabLetters[0].equalsIgnoreCase("A"));

//        char[] tabLetters = word.toCharArray();
//        System.out.println(word.toLowerCase().charAt(0) == 'a');


    }
}
