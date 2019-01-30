package sda.powtorka.tydzien1;

public class StringTests {

    public static void main(String[] args) {

        System.out.println("abc");
        String cde = "cde";
        System.out.println("abc" + cde);
        String c = "abcdef".substring(0,4);
        String d = cde.substring(1,3);
        System.out.println(c);
        System.out.println(d);
        System.out.println(cde.contains("e"));
    }
}
