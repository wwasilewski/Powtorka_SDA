package sda.powtorka.tydzien3.watki.przyklad7synchronizedblock;

/**
 * @author Wojciech Wasilewski
 * @date Created on 20.03.2019
 */
public class Synchronizacja2 {
    public static void main(String[] args) {

        Klasa_C system = new Klasa_C();

        Klasa_D w4 = new Klasa_D(system, "systemy skoku");
        Klasa_D w5 = new Klasa_D(system, "systemy podskoku");
        Klasa_D w6 = new Klasa_D(system, "systemy wyskoku");

        try {
            w4.t.join();
            w5.t.join();
            w6.t.join();

        } catch (InterruptedException e) {
            System.out.println("watek glowny zostal przerwany" + e);
        }
    }
}
