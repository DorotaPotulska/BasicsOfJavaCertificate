package com.company.part3;

import java.util.Scanner;

//        Zadanie 10
//        Napisz program, który odczytuje słowo i sprawdza czy dany String jest poprawnym adresem url.
//        Zakładamy, że adres url jest postaci http://www.wp.pl bądź postaci https://www.wp.pl bądź postaci www.wp.pl
//
public class Zad10 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter me word:");
        String adresURL = in.next();


        if (adresURL.matches("^(https://)?(http://)?(www\\.)?.+\\.[a-zA-Z]{2,4}$")) {
            System.out.println("This is adress url");
        } else {
            System.out.println("This isn't adress url");
        }
        ;

//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Podaj adres url");
//        String url = scanner.next();
//
//        if ( url.startsWith("http://")
//                || url.startsWith("https://")
//                || url.startsWith("www.")){
//            System.out.println("Adres url jest poprawny");
//        }
//        else{
//            System.out.println("Adres url jest niepoprawny");
    }
}
