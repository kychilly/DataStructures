package Week3;

import java.util.Scanner;

public class MaxLootValue {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(MaxLoot(scanner));
    }

    public static double MaxLoot(Scanner scanner) {
        int n = scanner.nextInt();
        int W = scanner.nextInt();

        double[][] items = new double[n][2];
        for (int i = 0; i < n; i++) {
            items[i][0] = scanner.nextDouble();
            items[i][1] = scanner.nextDouble();
        }
        //bubble sorting
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                double ratio1 = items[j][0] / items[j][1];
                double ratio2 = items[j + 1][0] / items[j + 1][1];
                if (ratio1 < ratio2) {
                    double[] temp = items[j];
                    items[j] = items[j + 1];
                    items[j + 1] = temp;
                }
            }
        }

        double totalValue = 0.0;
        int remainingCapacity = W;

        for (int i = 0; i < n; i++) {
            if (remainingCapacity == 0) break;

            double cost = items[i][0];
            double weight = items[i][1];

            if (weight <= remainingCapacity) {
                totalValue += cost;
                remainingCapacity -= weight;
            } else {
                double fraction = (double) remainingCapacity / weight;
                totalValue += cost * fraction;
                remainingCapacity = 0;
            }
        }

        return totalValue;
    }

}
