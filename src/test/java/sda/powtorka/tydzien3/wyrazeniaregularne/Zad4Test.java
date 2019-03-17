/*
 * Created by Wojciech Wasilewski on 2019 3 17
 * You can use this file without any restrictions. Have fun.
 */

package sda.powtorka.tydzien3.wyrazeniaregularne;

import org.junit.Assert;
import org.junit.Test;

import static org.hamcrest.core.Is.is;

public class Zad4Test {

    @Test
    public void czySprawdzCzyAlaOK() {
        Zad4 zad4 = new Zad4();
        Boolean wynik1 = zad4.sprawdzCzyAla("czy w tym zdaniu ukryla sie lalalllll?");
        Boolean wynik2 = zad4.sprawdzCzyAla("czy w tym zdaniu ukryla sie a la?");
        Boolean wynik3 = zad4.sprawdzCzyAla("lllaa lllaa aalla");
        Boolean wynik4 = zad4.sprawdzCzyAla("czy w tym zdaniu ukryla sie a lal a?");

        Assert.assertThat(wynik1, is(true));
        Assert.assertThat(wynik2, is(false));
        Assert.assertThat(wynik3, is(false));
        Assert.assertThat(wynik4, is(false));
    }
}
