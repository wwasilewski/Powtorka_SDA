/*
 * Created by Wojciech Wasilewski on 2019 3 18
 * You can use this file without any restrictions. Have fun.
 */

//Numer seryjny oprogramowania ma postać "CFG&Y-TYH67-GH56T-UIO99-RY4RT",
//gdzie każdy blok może składać się z dużych liter lub cyfr. Bloki oddzielone są
//myślnikami "-". W numerze występuje dokładnie 5 bloków z wartościami. Przygotuj
//wyrażenie regularne sprawdzające numer seryjny.

package sda.powtorka.tydzien3.wyrazeniaregularne;

import java.util.regex.Pattern;

public class Zad7 {
    public Boolean sprawdzNRSeryjny(String ciag) {
        Pattern pattern = Pattern.compile("^(([A-Z0-9]{5}-){4})([A-Z0-9]{5})$");
        Boolean wynik = pattern.matcher(ciag).matches();
        return wynik;
    }
}
