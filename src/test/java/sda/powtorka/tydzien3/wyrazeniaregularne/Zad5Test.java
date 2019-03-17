/*
 * Created by Wojciech Wasilewski on 2019 3 17
 * You can use this file without any restrictions. Have fun.
 */

package sda.powtorka.tydzien3.wyrazeniaregularne;

import org.junit.Assert;
import org.junit.Test;

import static org.hamcrest.core.Is.is;

public class Zad5Test {

    @Test
    public void czySprawdzDateOK() {
        Zad5 zad5 = new Zad5();
        Boolean wynik1 = zad5.sprawdzDate("13.02.1113r.");
        Boolean wynik2 = zad5.sprawdzDate("43.02.1113r.");
        Boolean wynik3 = zad5.sprawdzDate("13.13.1113r.");
        Boolean wynik4 = zad5.sprawdzDate("13.2.1113r.");
        Boolean wynik5 = zad5.sprawdzDate("13.02.1113r");
        Boolean wynik6 = zad5.sprawdzDate("13.02.1113");
        Boolean wynik7 = zad5.sprawdzDate("1.02.1113r.");

        Assert.assertThat(wynik1, is(true));
        Assert.assertThat(wynik2, is(false));
        Assert.assertThat(wynik3, is(false));
        Assert.assertThat(wynik4, is(false));
        Assert.assertThat(wynik5, is(false));
        Assert.assertThat(wynik6, is(false));
        Assert.assertThat(wynik7, is(false));
    }
}
