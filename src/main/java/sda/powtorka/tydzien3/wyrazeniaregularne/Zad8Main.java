/*
 * Created by Wojciech Wasilewski on 2019 3 18
 * You can use this file without any restrictions. Have fun.
 */

//Przygotuj wyrażenie regularne sprawdzające czy numer faktury VAT jest poprawny.
//Przykładowy numer faktury to "FV/1024/02/2018", gdzie
//FV - stały wpis
/// - stały znak rozdzielający sekcje
//1024 - kolejny numer faktury w danym miesiącu. Numer rozpoczyna się od 1
/// - stały znak rozdzielający sekcje
//02 - numer miesiąca w danym roku kalendarzowym
/// - stały znak rozdzielający sekcje
//2018 - rok
//W przypadku faktur o numerach 1-9 uzyj 0 na poczatku, np 01,02,03 itd.

package sda.powtorka.tydzien3.wyrazeniaregularne;

import java.util.Scanner;

public class Zad8Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Wprowadz nr faktury w postaci FV/1024/02/2018: ");
        String numerFaktury = sc.nextLine();

        Zad8 zad8 = new Zad8();
        Boolean numerPoprawny = zad8.sprawdzNRFaktury(numerFaktury);

        if (numerPoprawny) {
            System.out.println("Numer faktury poprawny");
        } else {
            System.out.println("Numer faktury niepoprawny");
        }
        sc.close();
    }
}
