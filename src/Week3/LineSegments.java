package Week3;

import java.util.Scanner;
import java.util.Arrays;

public class LineSegments {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] sigma = new int[scanner.nextInt()][2];
        for (int i = 0; i < sigma.length; i++) {
            sigma[i][0] = scanner.nextInt();
            sigma[i][1] = scanner.nextInt();
        }
        int[] result = LineSegments(sigma);
        System.out.println(result.length);
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }

    }

    public static int[] LineSegments(int[][] segments) {
        int n = segments.length;

        // Basic selection sort by right endpoint
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (segments[j][1] < segments[minIndex][1]) {
                    minIndex = j;
                }
            }
            // Swap segments[i] with segments[minIndex]
            int tempL = segments[i][0];
            int tempR = segments[i][1];
            segments[i][0] = segments[minIndex][0];
            segments[i][1] = segments[minIndex][1];
            segments[minIndex][0] = tempL;
            segments[minIndex][1] = tempR;
        }

        // Greedy selection of points
        int[] tempPoints = new int[n]; // max possible points
        int count = 0;
        int i = 0;

        while (i < n) {
            int point = segments[i][1]; // right endpoint
            tempPoints[count] = point;
            count++;

            // Skip all segments covered by this point
            i++;
            while (i < n && segments[i][0] <= point) {
                i++;
            }
        }

        // Copy only used points to a new array
        int[] result = new int[count];
        for (int j = 0; j < count; j++) {
            result[j] = tempPoints[j];
        }

        return result;
    }
}