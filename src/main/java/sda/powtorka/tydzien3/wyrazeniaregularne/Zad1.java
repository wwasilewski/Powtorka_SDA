//Przygotuj aplikację pobierającą od użytkownika dowolny ciąg znaków i sprawdzającą
//czy wprowadzona wartość jest wartością liczbową. Jeśli użytkownik wprowadził
//liczbę, sprawdź czy jest parzysta czy nieparzysta. Wyświetl komunikat informujący
//użytkownika o wprowadzeniu poprawnej lub błędnej liczby oraz o jej parzystości lub
//nieparzystości.

package sda.powtorka.tydzien3.wyrazeniaregularne;

import java.util.regex.Pattern;

public class Zad1 {

    public Boolean sprawdzCiag(String ciag) {
        Pattern pattern = Pattern.compile("-?[0-9]*");
        Boolean bool = pattern.matcher(ciag).matches();
        return bool;
    }
}
