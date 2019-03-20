package sda.powtorka.tydzien3.watki.przyklad6synchronized;

/**
 * @author Wojciech Wasilewski
 * @date Created on 20.03.2019
 */
public class Klasa_A {

    public synchronized void sprawdz(String info) {

        System.out.print("[" + info + "]");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            System.out.println("przerwano prace watku" + e);
        }
        System.out.println(" <-- GOTOWE");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            System.out.println("przerwano prace watku" + e);
        }
    }
}
