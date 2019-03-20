package sda.powtorka.tydzien3.watki.przyklad6synchronized;

/**
 * @author Wojciech Wasilewski
 * @date Created on 20.03.2019
 */
public class Synchronizacja {
    public static void main(String[] args) {

        Klasa_A system = new Klasa_A();

        Klasa_B w1 = new Klasa_B(system, "systemy zycia");
        Klasa_B w2 = new Klasa_B(system, "systemy inteligencji");
        Klasa_B w3 = new Klasa_B(system, "systemy napedu");

        try {
            w1.t.join();
            w2.t.join();
            w3.t.join();

        } catch (InterruptedException e) {
            System.out.println("watek glowny przerwany" + e);
        }
    }
}
