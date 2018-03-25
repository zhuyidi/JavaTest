package Main;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

/**
 * Created by dela on 3/24/18.
 */
public class Main3 {
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

//        for (int value : nums) {
//            if (temp.containsKey(value)) {
//                continue;
//            }
//
//            int n1 = value + k;
//            int n2 = value - k;
//
//
//            if (nums.indexOf(n1) != -1) {
//                temp.put(value, n1);
//                temp.put(n1, value);
//            }
//
//            if (nums.indexOf(n2) != -1) {
//                temp.put(value, n2);
//                temp.put(n2, value);
//            }
//        }
//
//        if (temp.size() % 2 == 0) {
//            System.out.println(temp.size()/2);
//        } else {
//            System.out.println(temp.size()/2 + 1);
//        }
    }
}
