package sda.powtorka.tydzien1;

import java.util.Arrays;
import java.util.List;
import java.util.StringJoiner;

public class StringTests {

    public static void main(String[] args) {

        System.out.println("abc");
        String cde = "cde";
        System.out.println("abc" + cde);
        String c = "abcdef".substring(1, 4);
        System.out.println(c);
        System.out.println(cde.contains("e"));

        System.out.println();
        String str = "This is my test string";
        System.out.println(str);

        System.out.println("sixth character is: " + str.charAt(5));

        //counting the occurence of a character in a string
        int counter = 0;

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 't') {
                counter++;
            }
        }
        System.out.println("char 't' occured " + counter + " times");

        //equals for checking values of 2 strings and == for checking if they are same object
        String first = new String("first");
        String second = new String("first");

        System.out.println(first.equals(second)); //== for same object
        System.out.println("hashcode of first string: " + first.hashCode());
        System.out.println("hashcode of second string: " + second.hashCode());

        System.out.println("from 8th index next string is \"my\": " + str.startsWith("my", 8));
        System.out.println("my test string ends with \"test string\": " + str.endsWith("test string"));

        List<String> list = Arrays.asList("Steve", "Rick", "Peter", "Abbey");
        String names = String.join("-^-", list);
        System.out.println(names);

        StringJoiner sj = new StringJoiner("--", "(", ")");
        sj.add("Tom").add("Ben").add("Ann");
        String finalSJ = sj.toString();
        System.out.println(finalSJ);

        String str2 = new String("My another testing string");
        char[] array = new char[6];
        str2.getChars(11, 16, array, 0);
        System.out.println("Array Content:" );

        for(char temp: array) {
            System.out.print(temp);
        }

        int number = 20;
        String str3 = String.valueOf(number);
        System.out.println("\n" + str3+19);

        int nu = 22;
        long lo = 2323l;
        float fl = 3.3232f;
        double dou = 3.232333d;
        char ch = 'W';
        char[] arr = {'w','o','j'};

        String nuStr = String.valueOf(nu);
        String loStr = String.valueOf(lo);
        String flStr = String.valueOf(fl);
        String douStr = String.valueOf(dou);
        String chStr = String.valueOf(ch);
        String arrStr = String.valueOf(arr);

        System.out.println(nuStr);
        System.out.println(loStr);
        System.out.println(flStr);
        System.out.println(douStr);
        System.out.println(chStr);
        System.out.println(arrStr);

    }
}
