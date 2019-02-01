//Napisz metodę łączącą (sklejającą) ciągi znaków – używając varargs

package sda.powtorka.tydzien1.mergingstrings;

public class MergeStringsVarArgsMain {
    public static void main(String[] args) {

        MergeStringsVarArgs msva = new MergeStringsVarArgs();
        System.out.println(msva.mergeStringsVarArgs("String", "to", "merge"));
        System.out.println(msva.mergeStringsVarArgs("String", "to", "merge", "and", "more"));
    }
}
