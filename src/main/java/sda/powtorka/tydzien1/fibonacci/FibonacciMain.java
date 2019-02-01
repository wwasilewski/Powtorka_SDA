//Napisz program, który wypisze 30 liczb z ciągu Fibonacciego

package sda.powtorka.tydzien1.fibonacci;

public class FibonacciMain {

    public static void main(String[] args) {
        Fibonacci fib = new Fibonacci();
        System.out.println("30 Fibonacci numbers(0 included): ");
        fib.fiboIter(30);
    }
}
