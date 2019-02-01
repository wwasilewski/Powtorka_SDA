//Utwórz klasę Zad2. W tej klasie:
//  - utwórz zmienną static int nrLini
//  - utwórz zmienną tablicową z nazwami dni tygodnia
//  - utwórz metodę która będzie wypisywać na konsole kolejny nr lini oraz tekst (w jednej linii)
//	* nagłówek metody powinien być taki: static void wypisz (String tekst){...}
//  - utwórz metodę psvm która w pętli wypisze wszystkie dni tygodnia używając wcześniej utworzonej metody wypisz()
//  program powinien wypisać coś takiego:
//  1: niedziela
//  2: poniedziałek
//  3: wtorek
//  itd.

package sda.powtorka.tydzien1.zad2;

public class Zad2 {
    static int nrLinii = 1;

    static void wypisz(String tekst) {
        System.out.println(nrLinii + ": " + tekst);
        nrLinii++;
    }

    public static void main(String[] args) {
        String[] dni = {"pon", "wto", "sro", "czw", "pia", "sob", "nie"};
        for (int i = 0; i < dni.length; i++) {
            wypisz(dni[i]);
        }
    }
}
