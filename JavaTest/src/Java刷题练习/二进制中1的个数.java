package Java刷题练习;

import java.util.Scanner;

/**
 * Created by dela on 4/3/18.
 */
public class 二进制中1的个数 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println(NumberOf1(n));
    }

    public static int NumberOf1(int n) {
        int count = 0;

        while (n != 0) {
            n = n & (n - 1);
            count++;
        }

        return count;
    }
}
