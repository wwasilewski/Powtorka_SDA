package sda.powtorka.tydzien3.watki.przyklad6synchronizedmethod;

/**
 * @author Wojciech Wasilewski
 * @date Created on 20.03.2019
 */
public class Klasa_B implements Runnable {

    Klasa_A system;
    String info;
    Thread t;

    public Klasa_B(Klasa_A sys, String str) {
        this.system = sys;
        this.info = str;
        t = new Thread(this);
        t.start();
    }

    public void run() {
        system.sprawdz(info);
    }
}
