package sda.powtorka.tydzien1;

public class StringTests {

    public static void main(String[] args) {

        System.out.println("abc");
        String cde = "cde";
        System.out.println("abc" + cde);
        String c = "abcdef".substring(1,4);
        System.out.println(c);
        System.out.println(cde.contains("e"));

        System.out.println();
        String str = "This is my test string";
        System.out.println(str);

        System.out.println("sixth character is: " + str.charAt(5));

        //counting the occurence of a character in a string
        int counter = 0;

        for (int i = 0; i < str.length(); i++)
        {
            if (str.charAt(i)== 't')
            {
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

        System.out.println("from 8th index next string is \"my\": " + str.startsWith("my",8));
        System.out.println("my test string ends with \"test string\": " + str.endsWith("test string"));
    }
}
