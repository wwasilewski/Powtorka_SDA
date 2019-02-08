//Utwórz kolejkę Queue korzystając z implementacji PriorityQueue.
//a. Pobierz od użytkownika ilość liczb jakie mają zostać wylosowane
//b. Wylosuj wskazaną przez użytkownika ilość liczb korzystając z klasy Random
//z zakresu <1,100> i dodaj je do kolejki.
//c. Wyświetl kolejno liczby występujące w kolejce.

package sda.powtorka.tydzien2.kolekcje;

import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Random;
import java.util.Scanner;

public class Zad6 {
    Queue<Integer> listaLiczb = new PriorityQueue<>();
    Random rand = new Random();

    public Zad6() {
        wylosujLiczby();
        wypisz();
    }

    public static void main(String[] args) {
        Zad6 zad6 = new Zad6();
    }

    public void wylosujLiczby() {
        Scanner sc = new Scanner(System.in);
        System.out.print("ile liczb wylosowac: ");
        int ileLiczb;
        ileLiczb = sc.nextInt();

        for (int i = 0; i < ileLiczb; i++) {
            int liczba = rand.nextInt(100) + 1;
            listaLiczb.add(liczba);
        }
        sc.close();
    }

    public void wypisz() {
        System.out.println("wylosowane liczby: " + listaLiczb);
    }
}
