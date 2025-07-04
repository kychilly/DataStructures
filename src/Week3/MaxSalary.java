package Week3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;


public class MaxSalary {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = scanner.nextInt();
        }
        System.out.print(maxNum(nums));
    }

    public static String maxNum(int[] num) {
        String[] nums = new String[num.length];
        for (int i = 0; i < num.length; i++) {
            nums[i] = "" + num[i];
        }
        // Simple bubble sort to arrange numbers
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = 0; j < nums.length - i - 1; j++) {

                String combo1 = nums[j] + nums[j+1];
                String combo2 = nums[j+1] + nums[j];

                // Swap if 2 is bigger i think
                if (combo2.compareTo(combo1) > 0) {
                    String temp = nums[j];
                    nums[j] = nums[j+1];
                    nums[j+1] = temp;
                }
            }
        }

        if (nums[0].equals("0")) {
            return "0";
        }

        StringBuilder result = new StringBuilder();
        for (String numb : nums) {
            result.append(numb);
        }
        return result.toString();
    }


    // I solved for the wrong thing lol dont use this method
    public static String MaxNum(int[] nums) {
        ArrayList<Integer> totalNums = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            while (nums[i] > 0) { // problem is here
                totalNums.add(nums[i]%10);
                nums[i] = nums[i] / 10;
            }
        }
        Collections.sort(totalNums);
        StringBuilder builder = new StringBuilder();
        for (int i : totalNums) {
            builder.append(i);
        }
        return builder.reverse().toString();
    }

}
