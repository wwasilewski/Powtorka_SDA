/*
 * Created by Wojciech Wasilewski on 2019 3 17
 * You can use this file without any restrictions. Have fun.
 */

package sda.powtorka.tydzien3.wyrazeniaregularne;

import org.junit.Assert;
import org.junit.Test;

import static org.hamcrest.core.Is.is;

public class Zad3Test {

    @Test
    public void czySprawdzLoginOK() {
        Zad3 zad3 = new Zad3();
        Boolean wynik1 = zad3.sprawdzLogin("Mojlogin44");
        Boolean wynik2 = zad3.sprawdzLogin("mojlogin44");
        Boolean wynik3 = zad3.sprawdzLogin("Mojloginnn");
        Boolean wynik4 = zad3.sprawdzLogin("mojlogin44");
        Boolean wynik5 = zad3.sprawdzLogin("Login44");
        Boolean wynik6 = zad3.sprawdzLogin("Moj-login44");
        Boolean wynik7 = zad3.sprawdzLogin("Mojlogin444444444");

        Assert.assertThat(wynik1, is(true));
        Assert.assertThat(wynik2, is(false));
        Assert.assertThat(wynik3, is(false));
        Assert.assertThat(wynik4, is(false));
        Assert.assertThat(wynik5, is(false));
        Assert.assertThat(wynik6, is(false));
        Assert.assertThat(wynik7, is(false));

    }
}
