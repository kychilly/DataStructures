package Week3;

import java.util.Scanner;
import java.util.Arrays;

public class MaxRevenue {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] prices = new int[n];
        int[] clicks = new int[n];
        for (int i = 0; i < n; i++) {
            prices[i] = scanner.nextInt();
        }
        for (int i = 0; i < n; i++) {
            clicks[i] = scanner.nextInt();
        }
        System.out.println(MaxRev(prices, clicks));

        }

    public static int MaxRev(int[] prices, int[] clicks) {
        Arrays.sort(prices);
        Arrays.sort(clicks);
        int sum = 0;
        for (int i = 0; i < prices.length; i++) {
            sum += prices[i] * clicks[i];
        }
        return sum;
    }

}
