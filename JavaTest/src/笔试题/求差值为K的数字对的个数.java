package 笔试题;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

/**
 * Created by dela on 3/24/18.
 */
public class 求差值为K的数字对的个数 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        List<Integer> nums = new ArrayList<>();
        HashMap<Integer, Integer> temp = new HashMap<>();
        int count = 0;


        for (int i = 0; i < n; i++) {
            int num = scanner.nextInt();
            int n1 = num + k;
            int n2 = num - k;

            nums.add(num);
            if(temp.containsKey(n1) || temp.containsKey(n2)) {
                if (temp.containsKey(n1) && temp.get(n1) == -1) {
                    temp.put(n1, num);
                    count++;
                }
                if (temp.containsKey(n2) && temp.get(n2) == -1) {
                    temp.put(n2, num);
                    count++;
                }
            }

            if (!temp.containsKey(num)) {
                temp.put(num, -1);
            }
        }

        System.out.println(count);
    }
}
