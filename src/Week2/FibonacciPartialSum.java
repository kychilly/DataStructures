package Week2;

import java.util.Scanner;

public class FibonacciPartialSum {
    private static int getFibonacciMod(long n) {
        if (n <= 1) return (int)n;
        n %= 60;

        int prev = 0, curr = 1;
        for (int i = 2; i <= n; i++) {
            int temp = (prev + curr) % 10;
            prev = curr;
            curr = temp;
        }
        return curr;
    }

    private static int getFibonacciPartialSum(long from, long to) {
        int sumTo = getFibonacciMod(to + 2);
        int sumFrom = getFibonacciMod(from + 1);
        int result = (sumTo - sumFrom + 10) % 10;
        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long from = scanner.nextLong();
        long to = scanner.nextLong();
        System.out.println(getFibonacciPartialSum(from, to));
    }
}
