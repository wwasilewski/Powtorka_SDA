/*
 * Created by Wojciech Wasilewski on 2019 3 18
 * You can use this file without any restrictions. Have fun.
 */

package sda.powtorka.tydzien3.wyrazeniaregularne;


import org.junit.Assert;
import org.junit.Test;

import static org.hamcrest.core.Is.is;

public class Zad7Test {
    @Test
    public void czySprawdzNRSeryjnyOK() {
        Zad7 zad7 = new Zad7();
        Boolean wynik1 = zad7.sprawdzNRSeryjny("CFGKY-TYH67-GH56T-UIO99-RY4RT");
        Boolean wynik2 = zad7.sprawdzNRSeryjny("CCCCC-CCCCC-CCCCC-CCCCC-CCCCC");
        Boolean wynik3 = zad7.sprawdzNRSeryjny("11111-11111-11111-11111-11111");
        Boolean wynik4 = zad7.sprawdzNRSeryjny("aFGKY-TYH67-GH56T-UIO99-RY4RT");
        Boolean wynik5 = zad7.sprawdzNRSeryjny("CFGKY-T%%67-GH56T-UIO99-RY4RT");
        Boolean wynik6 = zad7.sprawdzNRSeryjny("CFGKYTYH67GH56TUIO99RY4RT");
        Boolean wynik7 = zad7.sprawdzNRSeryjny("CFGKY-TYH67-GH56T-UIO99-RY4");
        Boolean wynik8 = zad7.sprawdzNRSeryjny("CFGKY-TYH67-GH56T-UIO99-RY4RTTTTTT");

        Assert.assertThat(wynik1, is(true));
        Assert.assertThat(wynik2, is(true));
        Assert.assertThat(wynik3, is(true));
        Assert.assertThat(wynik4, is(false));
        Assert.assertThat(wynik5, is(false));
        Assert.assertThat(wynik6, is(false));
        Assert.assertThat(wynik7, is(false));
        Assert.assertThat(wynik8, is(false));
    }
}
