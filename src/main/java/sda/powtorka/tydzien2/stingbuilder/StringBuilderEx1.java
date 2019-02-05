//Uzywac StringBuildera zeby nie tworzyc duzej ilosci Stringow

package sda.powtorka.tydzien2.stingbuilder;

public class StringBuilderEx1 {
    public static void main(String[] args) {

        String name = "Tom";
        Long start = System.nanoTime();

/**        Malo efektywne bo tworzy sie wiele obiektow String (czas i zasoby)
 //        for (int i = 0; i < 100000; i++) {
 //            name = name + "a";
 //        }
 //        System.out.println("Time1: " + (System.nanoTime()-start));
 */
        StringBuilder sb = new StringBuilder(name);

        for (int i = 0; i < 100000; i++) {
            sb.append("a");
        }
        System.out.println("Time2: " + (System.nanoTime() - start));
    }
}
