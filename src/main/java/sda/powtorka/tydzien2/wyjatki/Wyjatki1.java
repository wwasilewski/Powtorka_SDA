package sda.powtorka.tydzien2.wyjatki;

public class Wyjatki1 {
    public static void main(String[] args) {

        int[] array = {1, 2, 3, 4, 5};
        try {
            System.out.println(array[12]);
        } catch (IndexOutOfBoundsException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
