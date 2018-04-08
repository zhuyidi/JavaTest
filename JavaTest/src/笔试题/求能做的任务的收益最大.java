package 笔试题;

import java.util.Scanner;
import java.util.TreeMap;

/**
 * Created by dela on 4/5/18.
 */
public class 求能做的任务的收益最大 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int count = 0;
        int beni = 0;

        TreeMap<Integer, TreeMap<Integer, Integer>> user = new TreeMap<>();
        TreeMap<Integer, TreeMap<Integer, Integer>> renwu = new TreeMap<>();

        for (int i = 0; i < n; i++) {
            int xi = scanner.nextInt();
            int yi = scanner.nextInt();

            TreeMap<Integer, Integer> temp = new TreeMap<>();
            if (user.containsKey(xi)) {
                temp = user.get(xi);
                if (temp.containsKey(yi)) {
                    int value = temp.get(yi);
                    temp.put(yi, value + 1);
                }
            } else {
                temp.put(yi, 1);
                user.put(xi, temp);
            }
        }

        for (int i = 0; i < m; i++) {
            int xi = scanner.nextInt();
            int yi = scanner.nextInt();


            boolean mark = true;

            Integer outkey = user.higherKey(xi-1);
            while (outkey != null && mark) {
                TreeMap<Integer, Integer> temp = user.get(outkey);

                Integer inkey = temp.higherKey(yi-1);
                if (inkey != null && temp.get(inkey) > 0) {
                    count++;
                    beni += 200 * xi + 3 * yi;
                    int value = temp.get(inkey);
                    temp.put(inkey, value-1);
                    mark = false;
                } else {
                    outkey = user.higherKey(outkey);
                }
            }
        }

        System.out.println(count + " " + beni);
    }
}
