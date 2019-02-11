//Przygotuj aplikację pobierającą od użytkownika dowolny ciąg znaków i sprawdzającą
//czy wprowadzona wartość jest wartością liczbową. Jeśli użytkownik wprowadził
//liczbę, sprawdź czy jest parzysta czy nieparzysta. Wyświetl komunikat informujący
//użytkownika o wprowadzeniu poprawnej lub błędnej liczby oraz o jej parzystości lub
//nieparzystości.

package sda.powtorka.tydzien3.wyrazeniaregularne;

import java.util.Scanner;

public class Zad1Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("podaj ciag znakow do sprawdzenia czy jest liczba: ");
        String podanyCiag = sc.nextLine();

        Zad1 zad1 = new Zad1();
        Boolean ciagPoprawny = zad1.sprawdzCiag(podanyCiag);
        System.out.println("czy wprowadzony ciag znakow jest liczba: " + ciagPoprawny);

        try {
            int stringDoInt = Integer.parseInt(podanyCiag);
            if (ciagPoprawny) {
                if (0 == stringDoInt % 2) {
                    System.out.println("podany ciag znakow to liczba parzysta");
                } else {
                    System.out.println("podany ciag znakow to liczba nieparzysta");
                }
            }
        } catch (NumberFormatException e) {
            System.out.println("podany ciag nie jest liczba wiec nie sprawdzam parzystosci/nieparzystosci");
        }
        sc.close();
    }
}
