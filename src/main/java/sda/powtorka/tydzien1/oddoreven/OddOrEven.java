//Napisz program, który wyświetli wszystkie liczby parzyste od 1 do 20 oraz
//liczby podzielne przez 3

package sda.powtorka.tydzien1.oddoreven;

public class OddOrEven {
    public void oddOrEven(int range) {
        for (int i = 1; i <= range; i++) {
            if (0 == i % 2 && 0 == i % 3) {
                System.out.println("liczba " + i + " parzysta i podzielna przez 3");
            } else if (0 == i % 3) {
                System.out.println("liczba " + i + " podzielna przez 3");
            } else if (0 == i % 2) {
                System.out.println("liczba " + i + " parzysta");
            } else {
                System.out.println("liczba " + i + " nieparzysta");
            }
        }
    }
}
