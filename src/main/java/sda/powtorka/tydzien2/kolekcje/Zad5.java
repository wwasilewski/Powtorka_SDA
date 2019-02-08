//Utwórz tablicę ArrayList przechowującą imiona
//a. Korzystając z klasy Scanner pobierz od użytkownika 5 imion i zapisz je w
//liście.
//b. Wykorzystując pętlę while wyświetl wszystkie elementy znajdujące się w
//liście.

package sda.powtorka.tydzien2.kolekcje;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Zad5 {
    List<String> listaImion = new ArrayList<>();

    public Zad5() {
        zapiszImiona();
        wypiszImiona();
    }

    public static void main(String[] args) {
        Zad5 zad5 = new Zad5();
    }

    public void zapiszImiona() {
        System.out.println("Program wypisujacy 5 podanych imion");
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            String imie;
            System.out.print("Podaj imie: ");
            imie = sc.nextLine();
            listaImion.add(imie);
        }
        sc.close();
    }

    public void wypiszImiona() {
        System.out.println("Podane imiona to: ");
        int counter = 0;
        while (counter <= listaImion.size() - 1) {
            System.out.println(listaImion.get(counter));
            counter++;
        }
    }
}
