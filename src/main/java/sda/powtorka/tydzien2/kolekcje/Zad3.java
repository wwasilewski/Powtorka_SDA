//Utwórz listę ArrayList przechowującą liczby zmiennoprzecinkowe. Dodaj ręcznie 10
//liczb do listy.
//a. Wyświetl sumę pierwszego i ostatniego elementu zapisanego w liście.
//b. Wyświetl iloczyn pierwszego i ostatniego elementu zapisanego w liście.
//c. Wyświetl iloraz drugiego i przedostatniego elementu zapisanego w liście.

package sda.powtorka.tydzien2.kolekcje;

import java.util.ArrayList;
import java.util.List;

public class Zad3 {
    public static void main(String[] args) {

        List<Double> numbers = new ArrayList<>();
        numbers.add(3.5);
        numbers.add(5.2);
        numbers.add(1.1);
        numbers.add(4.0);
        numbers.add(33d);
        numbers.add(2.35);
        numbers.add(2.6);
        numbers.add(3.0);
        numbers.add(2.12);
        numbers.add(3.33);
        System.out.println("1+ostatni: " + (numbers.get(0) + numbers.get(numbers.size() - 1)));
        System.out.printf("1*ostatni: %.3f", (numbers.get(0) * numbers.get(numbers.size() - 1)));
        System.out.printf("\n2/przedostatni: %.3f", (numbers.get(1) / numbers.get(numbers.size() - 2)));
    }
}
