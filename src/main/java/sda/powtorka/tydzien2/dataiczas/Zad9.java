//Wykorzystując obiekt typu LocalTime wyświetl aktualny czas.

package sda.powtorka.tydzien2.dataiczas;

import java.time.LocalTime;

public class Zad9 {
    public static void main(String[] args) {
//        System.out.println(LocalTime.now()); // tak mozna szybciej
        LocalTime localTime = LocalTime.now();
        System.out.println(localTime);
    }
}
