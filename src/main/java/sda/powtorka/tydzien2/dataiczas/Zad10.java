//Wykorzystując obiekt typu LocalDate wyświetl aktualną datę.

package sda.powtorka.tydzien2.dataiczas;

import java.time.LocalDate;

public class Zad10 {
    public static void main(String[] args) {
//        System.out.println(LocalDate.now()); // tak mozna szybciej
        LocalDate localDate = LocalDate.now();
        System.out.println(localDate);
    }
}
