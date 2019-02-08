//Wyświetl bieżącą datę i godzinę w Tokyo.

package sda.powtorka.tydzien2.dataiczas;

import java.time.LocalDateTime;
import java.time.ZoneId;

public class Zad14 {
    public static void main(String[] args) {
        LocalDateTime localDateTime = LocalDateTime.now(ZoneId.of("Asia/Tokyo"));
        System.out.println(localDateTime);
    }
}
