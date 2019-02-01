//Napisz program, który wypisze 30 liczb z ciągu Fibonacciego

package sda.powtorka.tydzien1.fibonacci;

public class Fibonacci {

    public void fiboIter(int number) {
        int n1 = 0, n2 = 1;

        for (int i = 1; i <= number; i++) {
            System.out.println(i + " number: " + n1);
            int sum = n1 + n2;
            n1 = n2;
            n2 = sum;
        }
    }
}
