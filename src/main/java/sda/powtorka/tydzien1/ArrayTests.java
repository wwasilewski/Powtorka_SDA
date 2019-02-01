package sda.powtorka.tydzien1;

import java.util.Arrays;

public class ArrayTests {
    public static void main(String[] args) {

        String[] names = {"Ben", "Tom", "John", "Ann"};

        System.out.println("names array: " + Arrays.toString(names));
        System.out.println("3rd element of names array: " + names[2]);

        System.out.println("printing names array using for-each loop:");
        for (String s : names) {
            System.out.println(s);
        }

        System.out.println("printing names array using for loop:");
        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i]);
        }

        System.out.println("printing names array using while loop:");
        int counter = 0;
        while (counter < names.length) {
            System.out.println(names[counter]);
            counter++;
        }

        System.out.println("printing names array backwards using for loop:");
        for (int i = names.length - 1; i >= 0; i--) {
            System.out.println(names[i]);
        }


        int[][] numbers = {{9, 8, 7}, {1, 2, 7}, {4, 9, 2}, {6, 0, 5}};
        System.out.println("numbers 2d array: " + Arrays.deepToString(numbers));

        System.out.println("printing numbers 2d array using for loop:");
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers[j].length; j++) {
                System.out.print(numbers[i][j]);
            }
            System.out.println();
        }
    }
}
