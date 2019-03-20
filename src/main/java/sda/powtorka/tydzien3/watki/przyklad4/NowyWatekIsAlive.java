package sda.powtorka.tydzien3.watki.przyklad4;

/**
 * @author Wojciech Wasilewski
 * @date Created on 20.03.2019
 */
public class NowyWatekIsAlive implements Runnable {

    String nazwa;
    Thread t;

    public NowyWatekIsAlive(String nazwaWatku) {
        nazwa = nazwaWatku;
        t = new Thread(this, nazwa);
        System.out.println("nowy watek: " + t);
        t.start();
    }

    public void run() {
        try {
            for (int i = 6; i >= 0; i--) {
                System.out.println(nazwa + ": " + i);
                t.sleep(1000);
            }
        } catch (InterruptedException e) {
            System.out.println("przerwano " + nazwa + '\n' + e);
        }
        System.out.println("koniec watku: " + nazwa);
    }
}
