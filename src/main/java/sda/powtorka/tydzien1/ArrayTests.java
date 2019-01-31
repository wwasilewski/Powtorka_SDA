package sda.powtorka.tydzien1;

import java.util.Arrays;

public class ArrayTests {
    public static void main(String[] args) {

        String[] names = {"Ben", "Tom", "John", "Ann"};
        System.out.println(names[2]);

        for (String s : names) {
            System.out.println(s);
        }

        System.out.println(Arrays.toString(names));


        int[][] numbers = {{9, 8, 7}, {1, 2, 7}, {4, 9, 2}, {6, 0, 5}};

        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers[j].length; j++) {
                System.out.print(numbers[i][j]);
            }
            System.out.println();
        }
        System.out.println(Arrays.deepToString(numbers));

        int counter = 0;

        while (counter < names.length) {
            System.out.println(names[counter]);
            counter++;
        }
    }
}
