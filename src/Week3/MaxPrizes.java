package Week3;

import java.util.Scanner;
import java.util.ArrayList;

public class MaxPrizes {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        ArrayList<Integer> skib = MaxNums(n);
        System.out.println(skib.size());
        for (int e : skib) {
            System.out.print(e + " ");
        }
    }

    public static ArrayList<Integer> MaxNums(int n) {
        ArrayList<Integer> list = new ArrayList<>();
        int sum = 0;
        int counter = 1;
        while (sum + counter <= n) {
            list.add(counter);
            sum += counter++;
        }
        if (sum < n) {
            int temp = list.get(list.size()-1);
            list.set(list.size()-1, temp + n - sum);
        }

        return list;
    }

}
