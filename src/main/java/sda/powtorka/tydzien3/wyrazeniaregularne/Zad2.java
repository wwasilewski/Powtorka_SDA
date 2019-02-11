//Przygotuj aplikację pobierającą od użytkownika ciąg znaków i sprawdzającą czy
//podany tekst jest poprawnym polskim kodem pocztowym (np. 85-155, 00-122)

package sda.powtorka.tydzien3.wyrazeniaregularne;

import java.util.regex.Pattern;

public class Zad2 {

    public Boolean sprawdzKod(String ciag) {
        Pattern pattern = Pattern.compile("[0-9]{2}-[0-9]{3}");
        Boolean bool = pattern.matcher(ciag).matches();
        return bool;
    }
}
