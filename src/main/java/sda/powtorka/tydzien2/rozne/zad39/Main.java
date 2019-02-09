//Napisz program, który pobiera od użytkownika serię liczb różnych od zera (Zero
//kończy wprowadzanie danych). Po wprowadzeniu danych program oblicza sumę
//liczb wprowadzonych przez użytkownika, najmniejszą oraz największą liczbę. Na
//koniec działania wyświetla obliczone wartości. Oczywiście nie zapomnij o
//przechwyceniu ewentualnych wyjątków.

package sda.powtorka.tydzien2.rozne.zad39;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Zad39 zad39 = new Zad39();

        Scanner sc = new Scanner(System.in);
        System.out.println("podaj liczby do operacji (zero konczy wprowadzanie): ");


        List<Float> listaLiczb = Arrays.asList(1f, 2f, 3f, 4f, 5f);
        Float[] lista = listaLiczb.toArray(new Float[listaLiczb.size()]);

        System.out.println(zad39.najmniejsza(lista));
        System.out.println(zad39.najwieksza(lista));
        System.out.println(zad39.sumaLiczb(lista));
        zad39.wypisz(lista);

        sc.close();
    }
}
