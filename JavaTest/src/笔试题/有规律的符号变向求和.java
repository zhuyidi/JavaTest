package 笔试题;

import sun.reflect.generics.tree.Tree;

import java.util.Scanner;
import java.util.TreeMap;

/**
 * Created by dela on 4/5/18.
 */
public class 有规律的符号变向求和 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int result = 0;
        int mark = -1;

        for (int i = 1; i <= n; i++) {
            result += i * mark;

            if (i % m == 0) {
                mark = mark * -1;
            }
        }


        System.out.println(result);
    }
}
