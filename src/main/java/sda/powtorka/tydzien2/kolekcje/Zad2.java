//Utwórz listę ArrayList przechowującą liczby całkowite.
//a. Dodaj 3 dowolne liczby, a następnie wyświetl długość tablicy.
//b. Wyświetl pierwszy element zapisany w liście.
//c. Wyświetl ostatni element zapisany w liście

package sda.powtorka.tydzien2.kolekcje;

import java.util.ArrayList;
import java.util.List;

public class Zad2 {
    public static void main(String[] args) {

        List<Integer> numbers = new ArrayList<>();
        numbers.add(2);
        numbers.add(5);
        numbers.add(7);
        System.out.println("dlugosc tablicy: " + numbers.size());
        System.out.println("pierwszy element: " + numbers.get(0));
        System.out.println("ostatni element: " + numbers.get(numbers.size() - 1));
    }
}
