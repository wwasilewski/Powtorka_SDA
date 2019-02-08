//Utwórz obiekt typu LocalDate przechowujący datę 01.01.2017 oraz obiekt typu
//LocalDate przechowujący datę 05.05.2017. Wykorzystując obiekt typu Period
//Wyświetl ile czasu minęło pomiędzy datami.

package sda.powtorka.tydzien2.dataiczas;

import java.time.LocalDate;
import java.time.Period;

public class Zad12 {
    public static void main(String[] args) {
        LocalDate localDate1 = LocalDate.of(2017, 01, 01);
        System.out.println("1 data: " + localDate1);
        LocalDate localDate2 = LocalDate.of(2017, 05, 05);
        System.out.println("2 data: " + localDate2);

        Period period = Period.between(localDate1, localDate2);
        System.out.println("miedzy datami minelo: " + period.getMonths() + " M i " + period.getDays() + " D");
    }
}
