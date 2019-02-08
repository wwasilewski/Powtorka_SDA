//Wykorzystując obiekt typu LocalDateTime wyświetl aktualną datę i godzinę.

package sda.powtorka.tydzien2.dataiczas;

import java.time.LocalDateTime;

public class Zad11 {
    public static void main(String[] args) {
//        System.out.println(LocalDateTime.now()); // tak mozna szybciej
        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println(localDateTime);
    }
}
