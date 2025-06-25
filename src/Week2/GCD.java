package Week2;

import java.util.Scanner;

public class GCD {
    private static int gcd_naive(int a, int b) {
        if (b == 0) return a;
        int temp = a % b;
        return gcd_naive(b,temp);
    }

    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        int a = Math.abs(scanner.nextInt());
        int b = Math.abs(scanner.nextInt());

        System.out.println(gcd_naive(a, b));
    }
}
