package sda.powtorka.tydzien2.stringbuilder;

public class StringBuilderEx2 {
    public static void main(String[] args) {

        StringBuilder sb = new StringBuilder();

        sb.append("test_string").append("123");
        System.out.println("My test String: " + sb);

        //Startuje od 0 wiec tutaj winno byc 't'
        System.out.println("charAt(3): " + sb.charAt(3));

        //dec 116
        System.out.println("codePointAt(3): " + sb.codePointAt(3));

        //wiadomo
        System.out.println("String length: " + sb.length());

        //delete
        System.out.println("delete(11,13): " + sb.delete(11, 13));

        System.out.println("actual String: " + sb);

        //deleteChatAt()
        System.out.println("deleteChatAt(1): " + sb.deleteCharAt(1));

        //index of first occurance of ring in String
        System.out.println("indexOf(\"ring\")" + sb.indexOf("ring"));

        //replace
        System.out.println("replace(0,3,\"test\"): " + sb.replace(0, 3, "test"));

        //inserting something inside
        System.out.println("insert(2,\"tete\"): " + sb.insert(2, "tete"));

        //reverse
        System.out.println("reversed String: " + sb.reverse());

        //String formatting
        String name = "Wojciech";
        String surname = "Wojciechowski";
        int age = 33;
        float height = 186.5f;
        double temp = 27.34d;
        String dName = String.format("%s %s age: %d, height: %.2f, today's temp %+.3f", name, surname, age, height, temp);
        System.out.println(dName);

        System.out.printf("My name is: %s", "Wojciech");
    }
}
