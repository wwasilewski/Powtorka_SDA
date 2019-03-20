package sda.powtorka.tydzien3.watki.przyklad1runnable;

/**
 * @author Wojciech Wasilewski
 * @date Created on 19.03.2019
 */
public class Implementacja implements Runnable {

    Thread t;

    public Implementacja() {
        t = new Thread(this, "nowy watek");
        System.out.println("nowy watek: " + t);
        t.start(); //ta metoda wykonuje metode run()
    }


    @Override //nie musi byc tej adnotacji bo implementuje metode z interfejsu
    public void run() {
        try {
            for (int i = 5; i >= 0; i--) {
                System.out.println("nowy watek: " + i);
                Thread.sleep(500);
            }

        } catch (InterruptedException e) {
            System.out.println("nowy watek przerwany: " + e);
        }
        System.out.println("koniec nowego watku");
    }
}
