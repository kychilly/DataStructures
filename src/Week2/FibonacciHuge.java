package Week2;

import java.util.Scanner;

public class FibonacciHuge {
    private static long getPisanoPeriod(long m) {
        long prev = 0;
        long curr = 1;
        long period = 0;

        for (long i = 0; i < m * m; i++) {
            long temp = (prev + curr) % m;
            prev = curr;
            curr = temp;

            if (prev == 0 && curr == 1) {
                period = i + 1;
                break;
            }
        }
        return period;
    }

    private static long getFibonacciMod(long n, long m) {
        long pisanoPeriod = getPisanoPeriod(m);
        n %= pisanoPeriod;

        if (n <= 1) return n;

        long prev = 0;
        long curr = 1;

        for (long i = 2; i <= n; i++) {
            long temp = (prev + curr) % m;
            prev = curr;
            curr = temp;
        }

        return curr;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long n = scanner.nextLong();
        long m = scanner.nextLong();
        System.out.println(getFibonacciMod(n, m));//I really hope this works :pray:
    }
}

