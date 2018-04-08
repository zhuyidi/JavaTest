package Java刷题练习;

import java.util.Scanner;

/**
 * Created by dela on 4/3/18.
 */
public class 跳台阶变态 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int target = scanner.nextInt();
        System.out.println(JumpFloorII(target));
    }

    public static int JumpFloorII(int target) {
        // 当台阶数为n时, 跳法有n种,
        // 所以:f(n) = f(1) + f(2) + ... + f(n-1)
        //     f(n-1) = f(1) + f(2) + ... + f(n-2)
        // 两式相减, 就可得出: f(n) - f(n-1) = f(n-1)
        // 即: f(n) = 2*f(n-1);

        if (target == 1) {
            return 1;
        }

        return 2*JumpFloorII(target-1);
    }
}
