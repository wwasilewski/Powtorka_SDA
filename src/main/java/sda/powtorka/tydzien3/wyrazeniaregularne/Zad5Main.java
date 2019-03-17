/*
 * Created by Wojciech Wasilewski on 2019 3 17
 * You can use this file without any restrictions. Have fun.
 */

//Przygotuj aplikację pobierającą od użytkownika dowolny ciąg znaków i sprawdzjącą
//czy wprowadzona data jest poprawna. Za poprawną datę uważamy zapis w postaci
//"10.02.2018r.". Na potrzeby zadania nie weryfikujemy wartości dnia miesiąca. 45 to
//też poprawna wartość.

package sda.powtorka.tydzien3.wyrazeniaregularne;

import java.util.Scanner;

public class Zad5Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Podaj ciag znakow do sprawdzenia czy jest poprawna data w postaci np. 10.02.2019r.: ");
        String ciagusera = sc.nextLine();

        Zad5 zad5 = new Zad5();
        Boolean poprawnaData = zad5.sprawdzDate(ciagusera);

        if (poprawnaData) {
            System.out.println("Data poprawna");
        } else {
            System.out.println("Data niepoprawna");
        }
        sc.close();
    }
}
