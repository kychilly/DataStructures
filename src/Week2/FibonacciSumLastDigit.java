package Week2;

import java.util.Scanner;

public class FibonacciSumLastDigit {
    private static long getFibMod(long n) {
        n %= 60;
        if (n <= 1) return n;
        long a = 0, b = 1;
        for (int i = 2; i <= n; i++) {
            long c = (a + b) % 10;
            a = b;
            b = c;
        }
        return b;
    }

    private static long calcFibSum(long n) {
        long sum = getFibMod(n + 2) - 1;
        return (sum + 10) % 10;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long n = scanner.nextLong();
        System.out.println(calcFibSum(n));
    }
}

