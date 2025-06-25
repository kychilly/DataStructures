package Week2;

import java.util.Scanner;
import java.util.Arrays;

public class FibonacciLastDigit {
    private static long getFibonacciLastDigitNaive(int n) {
        if (n <= 1) return n;
        int s1 = 0;
        int s2 = 1;
        for (int i = 2; i < n+1; i++) {
            int temp = s1;
            s1 = s2;
            s2 = (s1 + temp)%10;
        }
        return s2;
    }



    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println(getFibonacciLastDigitNaive(n));
    }
}

