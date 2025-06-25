package Week2;

import java.util.Scanner;

public class FibonacciNum {
    private static long calc_fib(int n) {
        if (n <= 1) return n;
        long[] nums = new long[n+1];
        nums[0] = 0;
        nums[1] = 1;
        for (int i = 2; i < n+1; i++) {
            nums[i] = nums[i-1] + nums[i-2];
        }
        return nums[n];
    }

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        System.out.println(calc_fib(n));
    }
}
