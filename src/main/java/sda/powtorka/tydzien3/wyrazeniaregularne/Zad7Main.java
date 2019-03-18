/*
 * Created by Wojciech Wasilewski on 2019 3 18
 * You can use this file without any restrictions. Have fun.
 */

//Numer seryjny oprogramowania ma postać "CFG&Y-TYH67-GH56T-UIO99-RY4RT",
//gdzie każdy blok może składać się z dużych liter lub cyfr. Bloki oddzielone są
//myślnikami "-". W numerze występuje dokładnie 5 bloków z wartościami. Przygotuj
//wyrażenie regularne sprawdzające numer seryjny.

package sda.powtorka.tydzien3.wyrazeniaregularne;

import java.util.Scanner;

public class Zad7Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Podaj numer seryjny w formacie np. CFG&Y-TYH67-GH56T-UIO99-RY4RT: ");
        String numerUsera = sc.nextLine();

        Zad7 zad7 = new Zad7();
        Boolean numerPoprawny = zad7.sprawdzNRSeryjny(numerUsera);

        if (numerPoprawny) {
            System.out.println("Numer seryjny poprawny");
        } else {
            System.out.println("Numer niepoprawny");
        }
        sc.close();
    }
}
