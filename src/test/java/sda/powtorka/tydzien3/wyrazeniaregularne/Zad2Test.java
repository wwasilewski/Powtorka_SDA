/*
 * Created by Wojciech Wasilewski on 2019 3 17
 * You can use this file without any restrictions. Have fun.
 */

package sda.powtorka.tydzien3.wyrazeniaregularne;

import org.junit.Assert;
import org.junit.Test;

import static org.hamcrest.core.Is.is;

public class Zad2Test {

    @Test
    public void czySprawdzKodOK() {
        Zad2 zad2 = new Zad2();
        Boolean wynik1 = zad2.sprawdzKod("70-737");
        Boolean wynik2 = zad2.sprawdzKod("70737");
        Boolean wynik3 = zad2.sprawdzKod("7-0737");
        Boolean wynik4 = zad2.sprawdzKod("707-037");

        Assert.assertThat(wynik1, is(true));
        Assert.assertThat(wynik2, is(false));
        Assert.assertThat(wynik3, is(false));
        Assert.assertThat(wynik4, is(false));
    }
}
