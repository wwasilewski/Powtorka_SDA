package sda.powtorka.tydzien3.watki.przyklad7synchronizedblock;

/**
 * @author Wojciech Wasilewski
 * @date Created on 20.03.2019
 */
public class Klasa_D implements Runnable {

    Klasa_C system;
    String info;
    Thread t;

    public Klasa_D(Klasa_C sys, String str) {
        this.system = sys;
        this.info = str;
        t = new Thread(this);
        t.start();
    }

    public void run() {
        synchronized (system) {
            system.sprawdz(info);
        }
    }
}
