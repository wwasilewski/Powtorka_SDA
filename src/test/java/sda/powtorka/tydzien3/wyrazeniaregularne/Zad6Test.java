/*
 * Created by Wojciech Wasilewski on 2019 3 18
 * You can use this file without any restrictions. Have fun.
 */

package sda.powtorka.tydzien3.wyrazeniaregularne;


import org.junit.Assert;
import org.junit.Test;

import static org.hamcrest.core.Is.is;

public class Zad6Test {
    @Test
    public void czySprawdzNumerSeryjnyOK() {
        Zad6 zad6 = new Zad6();
        Boolean wynik1 = zad6.sprawdzNumerSeryjny("KSD43231fZ");
        Boolean wynik2 = zad6.sprawdzNumerSeryjny("kSD43231fZ");
        Boolean wynik3 = zad6.sprawdzNumerSeryjny("KSD43231FZ");
        Boolean wynik4 = zad6.sprawdzNumerSeryjny("KSD43231fz");
        Boolean wynik5 = zad6.sprawdzNumerSeryjny("KSDD3231fZ");
        Boolean wynik6 = zad6.sprawdzNumerSeryjny("KSD43231fZZ");
        Boolean wynik7 = zad6.sprawdzNumerSeryjny("KSD431fZZ");

        Assert.assertThat(wynik1, is(true));
        Assert.assertThat(wynik2, is(false));
        Assert.assertThat(wynik3, is(false));
        Assert.assertThat(wynik4, is(false));
        Assert.assertThat(wynik5, is(false));
        Assert.assertThat(wynik6, is(false));
        Assert.assertThat(wynik7, is(false));
    }
}
