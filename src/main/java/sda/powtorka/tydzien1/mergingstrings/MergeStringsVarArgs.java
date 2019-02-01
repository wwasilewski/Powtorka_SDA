//Napisz metodę łączącą (sklejającą) ciągi znaków – używając varargs

package sda.powtorka.tydzien1.mergingstrings;

public class MergeStringsVarArgs {
    public String mergeStringsVarArgs(String str1, String... strings) {
        String result = str1;
        for (int i = 0; i < strings.length; i++) {
            result = result + strings[i];
        }
        return result;
    }
}
