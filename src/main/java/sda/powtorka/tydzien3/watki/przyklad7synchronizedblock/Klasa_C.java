package sda.powtorka.tydzien3.watki.przyklad7synchronizedblock;

/**
 * @author Wojciech Wasilewski
 * @date Created on 20.03.2019
 */
public class Klasa_C {

    public void sprawdz(String info) {

        System.out.print("(" + info + ")");
        try {
            Thread.sleep(900);
        } catch (InterruptedException e) {
            System.out.println("przerwano prace watku" + e);
        }
        System.out.println(" <-- GOTOWE");
        try {
            Thread.sleep(900);
        } catch (InterruptedException e) {
            System.out.println("przerwano prace watku" + e);
        }
    }
}
