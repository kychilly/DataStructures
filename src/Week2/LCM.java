package Week2;

import java.util.Scanner;

public class LCM {
    private static long lcm_naive(int a, int b) {
        return Math.abs((long)a*b)/gcd_naive(a,b);
    }

    private static int gcd_naive(int a, int b) {
        if (b == 0) return a;
        int temp = a % b;
        return gcd_naive(b,temp);
    }

    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        System.out.println(lcm_naive(a, b));
    }
}
