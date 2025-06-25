import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {//832564823476
    private static int getFibonacciSumSquaresNaive(long n) {
        n = n % 60;
        if (n <= 1)
            return (int)n;

        long previous = 0;
        long current  = 1;
        int sum = 1;

        for (long i = 2; i < n + 1; i++) {
            long temp = previous;
            previous = current%10;
            current = (temp + current)%10;
            sum = (int)(sum + current*current)%10;
        }

        return sum;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long n = scanner.nextLong();
        int s = getFibonacciSumSquaresNaive(n);
        System.out.println(s);
    }
}