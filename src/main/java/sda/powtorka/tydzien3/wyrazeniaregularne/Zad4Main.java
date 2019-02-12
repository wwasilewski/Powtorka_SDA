//Przygotuj aplikację pobierającą od użytkownika dowolny ciąg znaków i sprawdzającą
//czy wprowadzona wartość zawiera słowo "ala".

package sda.powtorka.tydzien3.wyrazeniaregularne;

import java.util.Scanner;

public class Zad4Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("podaj ciag do sprawdzenia czy zawiera \"ala\": ");
        String ciagUsera = sc.nextLine();

        Zad4 zad4 = new Zad4();
        Boolean zawieraAla = zad4.sprawdzCzyAla(ciagUsera);

        if (zawieraAla) {
            System.out.println("podany ciag zawiera ciag \"ala\"");
        } else {
            System.out.println("podany ciag nie zawiera ciagu \"ala\"");
        }
        sc.close();
    }
}
