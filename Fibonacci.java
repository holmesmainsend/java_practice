import java.util.Scanner;

public class Fibonacci {
    private static long[] fibonacciCache;
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter nth number of Fibonacci sequence (0 < n < 93): ");
        int n = scan.nextInt();

        fibonacciCache = new long[n + 1];

        System.out.println("The value at the nth position is " + fibonacci(n));
        scan.close();
    }

    private static long fibonacci(int n) {
        if(n <= 1) {
            return n;
        }

        if(fibonacciCache[n] != 0) {
            return fibonacciCache[n];
        }

        long nthFibonacciNumber = fibonacci(n - 1) + fibonacci(n - 2);
        fibonacciCache[n] = nthFibonacciNumber;

        return nthFibonacciNumber;
    }
}