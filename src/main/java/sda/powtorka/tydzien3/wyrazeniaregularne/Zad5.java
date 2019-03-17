/*
 * Created by Wojciech Wasilewski on 2019 3 17
 * You can use this file without any restrictions. Have fun.
 */

//Przygotuj aplikację pobierającą od użytkownika dowolny ciąg znaków i sprawdzjącą
//czy wprowadzona data jest poprawna. Za poprawną datę uważamy zapis w postaci
//"10.02.2018r.". Na potrzeby zadania nie weryfikujemy wartości dnia miesiąca. 45 to
//też poprawna wartość.

package sda.powtorka.tydzien3.wyrazeniaregularne;

import java.util.regex.Pattern;

public class Zad5 {
    public Boolean sprawdzDate(String ciag) {
        Pattern pattern = Pattern.compile("^(3[01]|[12][0-9]|0[1-9]).(1[0-2]|0[1-9]).[0-9]{4}r.$");
        Boolean bool = pattern.matcher(ciag).matches();
        return bool;
    }
}
