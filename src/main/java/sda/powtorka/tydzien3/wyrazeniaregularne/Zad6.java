/*
 * Created by Wojciech Wasilewski on 2019 3 18
 * You can use this file without any restrictions. Have fun.
 */

//Przygotuj aplikację pobierającą od użytkownika dowolny ciąg znaków i sprawdzającą
//czy wprowadzony numer seryjny jest poprawny. Numer seryjny składa się z 3 dużych
//liter, 5 cyfr, 1 małej litery i 1 dużej litery np. VSD43281fA.

package sda.powtorka.tydzien3.wyrazeniaregularne;

import java.util.regex.Pattern;

public class Zad6 {
    public Boolean sprawdzNumerSeryjny(String ciag) {
        Pattern pattern = Pattern.compile("^[A-Z]{3}[0-9]{5}[a-z]{1}[A-Z]{1}$");
        Boolean wynik = pattern.matcher(ciag).matches();
        return wynik;
    }
}
