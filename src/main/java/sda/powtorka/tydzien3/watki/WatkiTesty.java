package sda.powtorka.tydzien3.watki;

/**
 * @author Wojciech Wasilewski
 * @date Created on 19.03.2019
 */
public class WatkiTesty {
    public static void main(String[] args) {

        Thread t = Thread.currentThread();
        System.out.println("watek glowny: " + t);

        String nazwaWatku = t.getName();
        System.out.println("nazwa watku glownego przed zmiana: " + nazwaWatku);

        t.setName("zmienionyWatekGlowny");
        nazwaWatku = t.getName();
        System.out.println("nazwa watku glownego po zmianie: " + nazwaWatku);

        try {
            for (int i = 1; i <= 7; i++) {
                System.out.println(i);
                Thread.sleep(800);
            }
            System.out.println("koniec");

        } catch (InterruptedException e) {
            System.out.println("watek glowny przerwany" + e);
        }
    }
}
