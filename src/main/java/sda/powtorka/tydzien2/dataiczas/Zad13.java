//Utwórz obiekt typu LocalTime przechowujący godzinę 14:11 oraz obiekt typu
//LocalTime przechowujący godzinę 18:41. Wykorzystując klasę Duration oblicz ile
//czasu upłynęło pomiędzy godzinami.

package sda.powtorka.tydzien2.dataiczas;

import java.time.Duration;
import java.time.LocalTime;

public class Zad13 {
    public static void main(String[] args) {
        LocalTime localTime1 = LocalTime.of(14, 11, 00);
        System.out.println("1 localtime: " + localTime1);
        LocalTime localTime2 = LocalTime.of(18, 41, 00);
        System.out.println("2 localtime: " + localTime2);

        Duration duration = Duration.between(localTime1, localTime2);
        System.out.println("miedzy nimi minelo : " + duration.toHours() +
                " H i " + (duration.toMinutes() - (duration.toHours() * 60)) + " M");
    }
}
