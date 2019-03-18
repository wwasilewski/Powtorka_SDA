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

import java.util.regex.Pattern;

public class Zad8 {
    public Boolean sprawdzNRFaktury(String numer) {
        Pattern pattern = Pattern.compile("^(FV\\/)[0-9]{2,}+\\/(1[0-2]|0[1-9])\\/[0-9]{4}$");
        Boolean wynik = pattern.matcher(numer).matches();
        return wynik;
    }
}
