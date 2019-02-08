//Utwórz zmienną typu String, a następnie przypisz do niej imię “Olgierd”.
//a. Wyświetl imię tak aby imię było wyświetlone dużymi literami
//b. Wyświetl imię tak aby imię było wyświetlone małymi literami
//c. Wyświetl długość imienia wykorzystująć odpowiednią metodę klasy String.
//d. Korzystając z odpowiedniej metody sprawdź czy imię rozpoczyna się od litery “O”
//e. Korzystając z odpowiedniej metody sprawdź czy imię zawiera literę “e”.
//f. Korzystając z odpowiedniej metody usuń litery “i” oraz “e” z imienia, a następnie wyświetl imię po zmianach.
//g. Wykorzystując pętlę for wyświetl kolejno litery imienia wraz z ich indeksem.
//Spodziewany rezultat wygląda następująco
//[1] = O
//[2] = l
//[3] = g
//[4] = i
//[5] = e
//[6] = r
//[7] = d

package sda.powtorka.tydzien2.wyjatki;

public class Zad8 {
    public static void main(String[] args) {

        String imie = "Olgierd";
        System.out.println("poczatkowy string: " + imie);
        System.out.println("duzymi literami: " + imie.toUpperCase());
        System.out.println("malymi literami: " + imie.toLowerCase());
        System.out.println("dlugosc stringa: " + imie.length());
        System.out.println("czy string rozpoczyna sie na \"O\": " + imie.startsWith("O"));
        System.out.println("czy string zawiera litere \"e\": " + imie.contains("e"));
        String noweImie = imie.replace("i", "").replace("e", "");
        System.out.println(noweImie);

        for (int i = 0; i < imie.length(); i++) {
            System.out.println("[" + (i + 1) + "] = " + imie.charAt(i));
        }
    }
}
