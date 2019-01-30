package sda.powtorka.tydzien1;

public class ConvertType {

    public static void main(String[] args) {

        //short -> int
        short a = 3;
        int b = 6;
        int div = b/a;
        System.out.println(div);

        //short -> long
        a = 6;
        long c = 18;
        long div2 = c/a;
        System.out.println(div2);

        //int -> float
        a = 4;
        float d = 16f;
        float div3 = d/a;
        System.out.println(div3);

        //int -> double
        a = 5;
        double e = 15d;
        double div4 = e/a;
        System.out.println(div4);

        //long -> int, short -> byte, char -> int sie nie da
        //bo jest utrata danych przy konwersji wiekszego
        //w mniejszy

    }
}
