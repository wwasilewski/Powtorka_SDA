//Utwórz listę ArrayList przechowującą liczby całkowite.
//a. Dodaj 5 liczb do listy.
//b. Pobierz 6 element z listy.
//c. Uruchom aplikację i sprawdź co pokaże IntelliJ w logach oraz w stacktrace.
//d. Zabezpiecz kod za pomocą klauzuli try catch.
//e. W przypadku wystąpienia błędu wyświetl stosowny komunikat.

package sda.powtorka.tydzien2.wyjatki;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Zad7 {
    public static void main(String[] args) {

        List<Integer> listaLiczb = new ArrayList<>(Arrays.asList(2, 3, 4, 5, 6));
        System.out.println("tablica liczb: " + listaLiczb);
        System.out.println("proba pobrania 6 z kolei liczby z tablicy: ");
        try {
            System.out.println(listaLiczb.get(5));
        } catch (IndexOutOfBoundsException e) {
            System.out.println("blad - proba pobrania liczby spoza zakresu tablicy");
            e.printStackTrace();
        }
    }
}
