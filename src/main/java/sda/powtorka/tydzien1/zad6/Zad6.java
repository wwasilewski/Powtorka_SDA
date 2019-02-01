//Zmodyfikuj program z zadania #3 tak aby wypisywał wyniki od 0 do 10 co 0.5

package sda.powtorka.tydzien1.zad6;

public class Zad6 {
    static double funkcja(double x) {
        return x * x + 3;
    }

    static void wypisz(double x, double y) {
        System.out.println("dla x = " + x + " y = " + y);
    }

    public static void main(String[] args) {

        for (int i = 1; i < 21; i++) {
            funkcja(i);
            wypisz(i / 2.0, funkcja(i / 2.0));
        }
    }
}
