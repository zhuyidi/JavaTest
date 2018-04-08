package Java刷题练习;

import java.util.Scanner;

/**
 * Created by dela on 4/3/18.
 */
public class 跳台阶 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int target = scanner.nextInt();
        System.out.println(JumpFloor(target));
    }

    public static int JumpFloor(int target) {
        // n = 1, 1 zhong tiao fa
        if (target == 1) {
            return 1;
        }
        // n = 2, 2 zhong tiao fa
        if (target == 2) {
            return 2;
        }
        return JumpFloor(target-1) + JumpFloor(target-2);
    }
}
