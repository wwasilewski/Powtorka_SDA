//Utwórz 10 elementową tablicę przechowującą liczby całkowite (int)
//a. Dodaj 10 kolejnych liczb do tablicy rozpoczynając od liczby 1
//b. Wyświetl długość tablicy
//c. Wyświetl kolejno elementy tablicy wykorzystując pętlę for.
//d. Wykorzystując pętlę for pomnóż przez 2 kolejno każdy element w tablicy i
//zapisz go ponownie w tablicy.
//e. Wyświetl kolejno elementy tablicy wykorzystując pętlę for.

package sda.powtorka.tydzien2.kolekcje;

import java.util.Arrays;

public class Zad1 {
    public static void main(String[] args) {
        int array[] = new int[10];

        for (int i = 0; i < array.length; i++) {
            array[i] = 1 + i;
        }
        System.out.println(Arrays.toString(array));
        System.out.println("dlugosc tablicy: " + array.length);

        for (int arr : array) {
            System.out.print(arr + " ");
        }

        for (int i = 0; i < array.length; i++) {
            array[i] = (1 + i) * 2;
        }

        for (int arr : array) {
            System.out.print("\n" + arr + " ");
        }
    }
}
