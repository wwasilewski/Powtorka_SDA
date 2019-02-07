//Utwórz listę ArrayList przechowującą imiona.
//a. Dodaj 5 imion do listy,
//b. Wykorzystując pętle for pobierz i wyświetl kolejno wszystkie elementy z listy.
//c. Wykorzystując pętle for pobierz i wyświetl kolejno wszystkie elementy z listy
//zaczynając od ostatniego, a kończąc na pierwszym.

package sda.powtorka.tydzien2.kolekcje;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Zad4 {
    public static void main(String[] args) {
        List<String> listOfNames = new ArrayList<>(Arrays.asList("Wojtek", "Anna", "Tomek", "Marek", "Kasia"));

        System.out.println("lista po kolei, petla for: ");
        for (int i = 0; i < listOfNames.size(); i++) {
            System.out.println(listOfNames.get(i));
        }

        System.out.println("lista po kolei, petla for-each: ");
        for (String list : listOfNames) {
            System.out.println(list);
        }

        System.out.println("lista od konca, petla for: ");
        for (int i = listOfNames.size() - 1; i >= 0; i--) {
            System.out.println(listOfNames.get(i));
        }
    }
}
