//Zmodyfikuj program z zadania #3 tak aby wypisywał wyniki tylko dla liczb parzystych

package sda.powtorka.tydzien1.zad5;

public class Zad5 {
    static double funkcja(double x) {
        return x * x + 3;
    }

    static void wypisz(double x, double y) {
        System.out.println("dla x = " + x + " y = " + y);
    }

    public static void main(String[] args) {

        for (int i = 1; i < 21; i++) {
            funkcja(i);
            if (0 == i % 2) {
                wypisz(i, funkcja(i));
            }
        }
    }
}
