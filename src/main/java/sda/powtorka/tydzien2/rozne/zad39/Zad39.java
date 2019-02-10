//Napisz program, który pobiera od użytkownika serię liczb różnych od zera (Zero
//kończy wprowadzanie danych). Po wprowadzeniu danych program oblicza sumę
//liczb wprowadzonych przez użytkownika, najmniejszą oraz największą liczbę. Na
//koniec działania wyświetla obliczone wartości. Oczywiście nie zapomnij o
//przechwyceniu ewentualnych wyjątków.

package sda.powtorka.tydzien2.rozne.zad39;

import java.util.Arrays;

public class Zad39 {
    public float sumaLiczb(Float... liczba) {
        float suma = 0;
        for (int i = 0; i < liczba.length; i++) {
            suma = suma + liczba[i];
        }
        return suma;
    }

    public float najwieksza(Float... liczba) {
        float najwieksza = liczba[0];
        for (int i = 0; i < liczba.length; i++) {
            if (najwieksza < liczba[i]) {
                najwieksza = liczba[i];
            }
        }
        return najwieksza;
    }

    public float najmniejsza(Float... liczba) {
        float najmniejsza = liczba[0];
        for (int i = 0; i < liczba.length; i++) {
            if (najmniejsza > liczba[i]) {
                najmniejsza = liczba[i];
            }
        }
        return najmniejsza;
    }

    public void wypisz(Float... liczba) {
        System.out.println("podane liczby to: " + Arrays.toString(liczba));
        System.out.println("suma liczb to: " + sumaLiczb(liczba));
        System.out.println("najmniejsza liczba to: " + najmniejsza(liczba));
        System.out.println("najwieksza liczba to: " + najwieksza(liczba));
    }
}
