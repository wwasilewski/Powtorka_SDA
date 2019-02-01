//Napisz metodę sumującą dowolną ilość liczb – używając varargs

package sda.powtorka.tydzien1.sumvarargs;

public class SumVarArgsMain {
    public static void main(String[] args) {

        SumVarArgs sva = new SumVarArgs();
        System.out.println("2+3 using varargs: " + sva.sumVarArgs(2, 3));
        System.out.println("2+3+5 using varargs: " + sva.sumVarArgs(2, 3, 5));
        System.out.println("2+3+5+10 using varargs: " + sva.sumVarArgs(2, 3, 5, 10));
    }
}
