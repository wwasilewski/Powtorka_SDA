/*
 * Created by Wojciech Wasilewski on 2019 3 17
 * You can use this file without any restrictions. Have fun.
 */

package sda.powtorka.tydzien3.wyrazeniaregularne;

import org.junit.Assert;
import org.junit.Test;

import static org.hamcrest.core.Is.is;

public class Zad1Test {

    @Test
    public void czySprawdzCiagOK() {
        Zad1 zad1 = new Zad1();
        Boolean wynik1 = zad1.sprawdzCiag("12345678");
        Boolean wynik2 = zad1.sprawdzCiag("1234567a");
        Boolean wynik3 = zad1.sprawdzCiag("a2345678");
        Boolean wynik4 = zad1.sprawdzCiag("1234-567");

        Assert.assertThat(wynik1, is(true));
        Assert.assertThat(wynik2, is(false));
        Assert.assertThat(wynik3, is(false));
        Assert.assertThat(wynik4, is(false));
    }
}
