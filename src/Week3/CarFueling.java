package Week3;

import java.util.Scanner;

public class CarFueling {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int distance = scanner.nextInt();
        int possibleMiles = scanner.nextInt();
        int numStops = scanner.nextInt();
        int[] stops = new int[numStops + 2];
        stops[0] = 0;
        for (int i = 1; i <= numStops; i++) {
            stops[i] = scanner.nextInt();
        }
        stops[numStops + 1] = distance;//start at 0, end at distance
        System.out.println(bob(distance, possibleMiles, stops));
    }

    public static int bob(int distance, int possibleMiles, int[] stops) {
        int timesStopped = 0;
        int currentIndex = 0;

        while (currentIndex < stops.length - 1) {
            int lastIndex = currentIndex;
            while (currentIndex < stops.length - 1 && stops[currentIndex + 1] - stops[lastIndex] <= possibleMiles) {
                currentIndex++;
            }

            if (currentIndex == lastIndex) {
                return -1;//in case distance is too much
            }

            if (currentIndex < stops.length - 1) {
                timesStopped++;
            }
        }

        return timesStopped;
    }
}
