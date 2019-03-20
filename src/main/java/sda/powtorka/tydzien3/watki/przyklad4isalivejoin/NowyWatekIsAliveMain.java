package sda.powtorka.tydzien3.watki.przyklad4isalivejoin;

/**
 * @author Wojciech Wasilewski
 * @date Created on 20.03.2019
 */
public class NowyWatekIsAliveMain {
    public static void main(String[] args) {

        NowyWatekIsAlive w1 = new NowyWatekIsAlive("pierwszy watek");
        NowyWatekIsAlive w2 = new NowyWatekIsAlive("drugi watek");
        NowyWatekIsAlive w3 = new NowyWatekIsAlive("trzeci watek");

        System.out.println("czy pierwszy watek zyje?: " + w1.t.isAlive());
        System.out.println("czy drugi watek zyje?: " + w2.t.isAlive());
        System.out.println("czy trzeci watek zyje?: " + w3.t.isAlive());

        try {
            System.out.println("oczekiwanie na zakonczenie watkow");
            w1.t.join();
            w2.t.join();
            w3.t.join();

        } catch (InterruptedException e) {
            System.out.println("przerwano prace watku glownego" + e);
        }

        System.out.println("czy pierwszy watek nadal zyje?: " + w1.t.isAlive());
        System.out.println("czy drugi watek nadal zyje?: " + w2.t.isAlive());
        System.out.println("czy trzeci watek nadal zyje?: " + w3.t.isAlive());

        System.out.println("koniec watku glownego");
    }
}
