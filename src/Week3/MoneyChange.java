package Week3;

import java.util.Arrays;
import java.util.Scanner;

public class MoneyChange {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(money(scanner.nextInt()));
    }

    public static int money(int a) {
        int[] coins = {10, 5, 1};
        int coinCounter = 0;
        int counter = 0;
        int money = a;

        while (money > 0) {
            if (coins[coinCounter] > money) {
                coinCounter++;
                continue;
            }
            money -= coins[coinCounter];
            counter++;
        }
        return counter;
    }
}
