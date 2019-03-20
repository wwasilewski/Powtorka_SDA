package sda.powtorka.tydzien3.watki.przyklad3wielewatkow;

/**
 * @author Wojciech Wasilewski
 * @date Created on 20.03.2019
 */
public class NowyWatekMain {
    public static void main(String[] args) {

        new NowyWatek("pierwszy watek");
        new NowyWatek("drugi watek");
        new NowyWatek("trzeci watek");

        try {
            Thread.sleep(8000);

        } catch (InterruptedException e) {
            System.out.println("przerwano watek glowny" + e);
        }
        System.out.println("koniec watku glownego");
    }
}
