/*
 * Created by Wojciech Wasilewski on 2019 3 18
 * You can use this file without any restrictions. Have fun.
 */

package sda.powtorka.tydzien3.wyrazeniaregularne;

import org.junit.Assert;
import org.junit.Test;

import static org.hamcrest.core.Is.is;

public class Zad8Test {
    @Test
    public void czySprawdzNRFakturyOK() {
        Zad8 zad8 = new Zad8();
        Boolean wynik1 = zad8.sprawdzNRFaktury("FV/1024/02/2018");
        Boolean wynik2 = zad8.sprawdzNRFaktury("FV/10244/02/2018");
        Boolean wynik3 = zad8.sprawdzNRFaktury("FV/01/02/2018");
        Boolean wynik4 = zad8.sprawdzNRFaktury("FV/333/12/2018");
        Boolean wynik5 = zad8.sprawdzNRFaktury("fV/01/02/2018");
        Boolean wynik6 = zad8.sprawdzNRFaktury("FV/1/02/2018");
        Boolean wynik7 = zad8.sprawdzNRFaktury("FV/01/22/2018");
        Boolean wynik8 = zad8.sprawdzNRFaktury("FV/01/02/20189");
        Boolean wynik9 = zad8.sprawdzNRFaktury("FV010220189");
        Boolean wynik10 = zad8.sprawdzNRFaktury("FV-01-02-2018");

        Assert.assertThat(wynik1, is(true));
        Assert.assertThat(wynik2, is(true));
        Assert.assertThat(wynik3, is(true));
        Assert.assertThat(wynik4, is(true));
        Assert.assertThat(wynik5, is(false));
        Assert.assertThat(wynik6, is(false));
        Assert.assertThat(wynik7, is(false));
        Assert.assertThat(wynik8, is(false));
        Assert.assertThat(wynik9, is(false));
        Assert.assertThat(wynik10, is(false));
    }
}
