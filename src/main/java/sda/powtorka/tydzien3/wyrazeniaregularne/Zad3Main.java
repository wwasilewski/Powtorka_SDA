//Przygotuj aplikację pobierającą od użytkownika dowolny ciąg znaków i sprawdzającą
//czy wprowadzona wartość jest poprawnym loginem użytkownika. Za poprawny login
//uważamy tekst zawierający małe i duże litery oraz cyfry. Jego minimalna długość to 8
//a maksymalna 16 znaków.

package sda.powtorka.tydzien3.wyrazeniaregularne;

import java.util.Scanner;

public class Zad3Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("podaj login (ciag zawierajacy male, duze litery oraz cyfry, od 8 do 16 znakow): ");
        String podanyLogin = sc.nextLine();

        Zad3 zad3 = new Zad3();
        Boolean loginPoprawny = zad3.sprawdzLogin(podanyLogin);

        if (loginPoprawny) {
            System.out.println("login poprawny");
        } else {
            System.out.println("login niepoprawny");
        }
        sc.close();
    }
}
