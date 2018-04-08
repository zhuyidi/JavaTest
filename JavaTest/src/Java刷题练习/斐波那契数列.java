package Java刷题练习;

import java.util.Scanner;

/**
 * Created by dela on 4/3/18.
 */
public class 斐波那契数列 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println(Fibonacci(n));
    }

    public static int Fibonacci(int n) {
        if (n == 0) {
            return 0;
        }

        if (n == 1) {
            return 1;
        }

        return Fibonacci(n-1) + Fibonacci(n-2);
    }
}