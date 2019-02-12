//Przygotuj aplikację pobierającą od użytkownika dowolny ciąg znaków i sprawdzającą
//czy wprowadzona wartość jest poprawnym loginem użytkownika. Za poprawny login
//uważamy tekst zawierający małe i duże litery oraz cyfry. Jego minimalna długość to 8
//a maksymalna 16 znaków.

package sda.powtorka.tydzien3.wyrazeniaregularne;

import java.util.regex.Pattern;

public class Zad3 {
    public Boolean sprawdzLogin(String login) {
        Pattern pattern = Pattern.compile("[a-zA-Z0-9]{8,16}");
        Boolean bool = pattern.matcher(login).matches();
        return bool;
    }
}
