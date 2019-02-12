//Przygotuj aplikację pobierającą od użytkownika dowolny ciąg znaków i sprawdzającą
//czy wprowadzona wartość zawiera słowo "ala".

package sda.powtorka.tydzien3.wyrazeniaregularne;

import java.util.regex.Pattern;

public class Zad4 {
    public Boolean sprawdzCzyAla(String ciag) {
        Pattern pattern = Pattern.compile(".*ala.*");
        Boolean bool = pattern.matcher(ciag).matches();
        return bool;
    }
}
