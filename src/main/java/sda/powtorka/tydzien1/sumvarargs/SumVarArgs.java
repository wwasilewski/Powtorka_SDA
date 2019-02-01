//Napisz metodę sumującą dowolną ilość liczb – używając varargs

package sda.powtorka.tydzien1.sumvarargs;

public class SumVarArgs {
    public int sumVarArgs(int arg0, int... args) {
        int result = arg0;

        for (int i = 0; i < args.length; i++) {
            result = result + args[i];
        }
        return result;
    }
}
