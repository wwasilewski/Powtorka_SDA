//Napisz program, który pobiera od użytkownika serię liczb różnych od zera (Zero
//kończy wprowadzanie danych). Po wprowadzeniu danych program oblicza sumę
//liczb wprowadzonych przez użytkownika, najmniejszą oraz największą liczbę. Na
//koniec działania wyświetla obliczone wartości. Oczywiście nie zapomnij o
//przechwyceniu ewentualnych wyjątków.

package sda.powtorka.tydzien2.rozne.zad39;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Zad39 zad39 = new Zad39();

        Scanner sc = new Scanner(System.in);
        System.out.print("podaj liczby do operacji (zero konczy wprowadzanie): ");
        float liczba;
        boolean czyZero = true;

        List<Float> listaLiczb = new ArrayList<>();

        while (czyZero) {
            try {
                liczba = Float.parseFloat(sc.nextLine());
                if (0 != liczba) {
                    listaLiczb.add(liczba);
                    System.out.print("podaj kolejna liczbe: ");
                } else {
                    System.out.println("koniec podawania liczb bo podales 0");
                    Float[] lista = listaLiczb.toArray(new Float[listaLiczb.size()]);
                    zad39.wypisz(lista);
                    break;
                }
            } catch (NumberFormatException e) {
                System.out.print("niepoprawne dane, wprowadz ponownie: ");
            }
        }
        sc.close();
    }
}
