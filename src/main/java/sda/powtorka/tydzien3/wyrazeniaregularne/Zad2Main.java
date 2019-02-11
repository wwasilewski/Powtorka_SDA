//Przygotuj aplikację pobierającą od użytkownika ciąg znaków i sprawdzającą czy
//podany tekst jest poprawnym polskim kodem pocztowym (np. 85-155, 00-122)

package sda.powtorka.tydzien3.wyrazeniaregularne;

import java.util.Scanner;

public class Zad2Main {
    public static void main(String[] args) {

        System.out.print("podaj ciag do sprawdzenia czy jest poprawnym polskim kodem pocztowym: ");
        Scanner sc = new Scanner(System.in);
        String podanyCiag = sc.nextLine();

        Zad2 zad2 = new Zad2();
        Boolean bool = zad2.sprawdzKod(podanyCiag);

        if (bool) {
            System.out.println("podany ciag JEST poprawnym polskim kodem pocztowym");
        } else {
            System.out.println("podany ciag NIE JEST poprawnym polskim kodem pocztowym");
        }
        sc.close();
    }
}
