package 笔试题;

import java.util.Scanner;
import java.util.TreeMap;

/**
 * Created by dela on 3/27/18.
 */
public class 求最大工资 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        TreeMap<Integer, Integer> map = new TreeMap<>();

        int n = scanner.nextInt();
        int m = scanner.nextInt();


        if (n >= 100000 || m >= 100000) {
            return;
        }

        for (int i = 0; i < n; i++) {
            int key = scanner.nextInt();
            int value = scanner.nextInt();

            if(key >= 1000000000 || value >= 1000000000) {
                continue;
            }

            if (map.containsKey(key)) {
                if(map.get(key) >= value) {
                    continue;
                }
            }
            map.put(key, value);
        }


        for (int i = 0; i < m; i++) {
            int index = scanner.nextInt();
            if (!map.containsKey(index)) {
                try {
                    index = map.lowerKey(index);
                } catch (NullPointerException e) {
                    System.out.println(0);
                    continue;
                }
            }
            System.out.println(map.get(index));
        }
    }
}
