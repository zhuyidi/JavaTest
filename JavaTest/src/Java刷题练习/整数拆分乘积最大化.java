package Java刷题练习;

import java.util.Scanner;

/**
 * Created by dela on 4/3/18.
 */
public class 整数拆分乘积最大化 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println(integerBreak(n));
    }

    // 当n>=5的时候, 尽可能的分出更多的3,
    // 当n=4的时候, 拆分为2+2
    public static int integerBreak(int n) {
        if (n <= 1) {
            return 0;
        }
        if (n == 2) {
            return 1;
        }
        if (n == 3) {
            return 2;
        }
        if (n == 4) {
            return 4;
        }

        int countOf3 = n / 3;

        int last = n - countOf3*3;
        if (last == 1) {
            countOf3 -= 1;
            last += 3;
        }

        int countOf2 = last / 2;
        return (int) ((Math.pow(3, countOf3)) * (Math.pow(2, countOf2)));
    }
}
