//Program wyswietlajacy konkretny element z tablicy, z walidacja danych

package sda.powtorka.tydzien2.wyjatki;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class WalidacjaDanychTablicy {
    public static void main(String[] args) {

        int tab[] = {2, 4, 6, 8, 50};
        System.out.println("Dostepna tablica: " + Arrays.toString(tab));
        BufferedReader odczyt = new BufferedReader(new InputStreamReader(System.in));

        int index;
        System.out.print("Ktory element tablicy chcesz zobaczyc?: ");

        boolean czyZle = true;
        while (czyZle) {
            try {
                index = Integer.parseInt(odczyt.readLine());
                System.out.println("Szukany element to: " + tab[index - 1]);
                czyZle = false;

            } catch (NumberFormatException n) {
                System.out.println("Niepoprawne dane! " + "\nWprowadz ponownie: ");
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Niepoprawny parametr, rozmiar tablicy to: "
                        + tab.length + "\nWprowadz ponownie: ");
            } catch (IOException e) {
                System.out.println("Blad odczytu danych");
            }
        }
    }
}
