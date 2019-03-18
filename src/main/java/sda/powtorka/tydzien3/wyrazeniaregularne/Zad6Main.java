/*
 * Created by Wojciech Wasilewski on 2019 3 18
 * You can use this file without any restrictions. Have fun.
 */

//Przygotuj aplikację pobierającą od użytkownika dowolny ciąg znaków i sprawdzającą
//czy wprowadzony numer seryjny jest poprawny. Numer seryjny składa się z 3 dużych
//liter, 5 cyfr, 1 małej litery i 1 dużej litery np. VSD43281fA.

package sda.powtorka.tydzien3.wyrazeniaregularne;

import java.util.Scanner;

public class Zad6Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Podaj numer seryjny do sprawdzenia w formacie np. VSD43281fA: ");
        String numerUsera = sc.nextLine();

        Zad6 zad6 = new Zad6();
        Boolean numerPoprawny = zad6.sprawdzNumerSeryjny(numerUsera);

        if (numerPoprawny) {
            System.out.println("Numer seryjny poprawny");
        } else {
            System.out.println("Numer niepoprawny");
        }
        sc.close();
    }
}
