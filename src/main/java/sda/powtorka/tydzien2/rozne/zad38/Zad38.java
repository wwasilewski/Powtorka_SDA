//Napisz program obliczający pole powierzchni koła. Promień koła użytkownik
//wprowadza z klawiatury. Program powinien zasygnalizować błędne dane (liczbę
//ujemną lub zero) i ponownie zapytac o długośc promienia. Wykorzystaj metodę
//Parse klasy float. Oczywiście nie zapomnij o przechwyceniu ewentualnych wyjątków.

package sda.powtorka.tydzien2.rozne.zad38;

import java.util.Scanner;

public class Zad38 {

    public double poleKola(float promien) {
        return Math.PI * promien * promien;
    }

    public void wypisz() {
        System.out.print("Podaj promien kola do obliczenia pola powierzchni: ");
        Scanner sc = new Scanner(System.in);
        float promien;

        boolean czyZle = true;
        while (czyZle) {
            try {
                promien = Float.parseFloat(sc.nextLine());
                if (promien > 0) {
                    System.out.printf("pole powierzchni kola rowne: %.2f", poleKola(promien));
                    czyZle = false; //mozna tez zrobic break
                } else {
                    System.out.println("promien musi byc dodatni, jeszcze raz: ");
                }
            } catch (NumberFormatException e) {
                System.out.println("niepoprawne dane, wprowadz ponownie: ");
            }
        }
        sc.close();
    }
}
