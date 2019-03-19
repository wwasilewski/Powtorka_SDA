package sda.powtorka.tydzien3.watki.przyklad1;

/**
 * @author Wojciech Wasilewski
 * @date Created on 19.03.2019
 */
public class ImplementacjaMain {
    public static void main(String[] args) {

        new Implementacja();

        try {
            for (int i = 5; i >= 0; i--) {
                System.out.println("watek glowny: " + i);
                Thread.sleep(1000);
            }

        } catch (InterruptedException e) {
            System.out.println("przerwano watek glowny " + e);
        }
        System.out.println("koniec watku glownego");
    }
}
