package 笔试题;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

/**
 * Created by dela on 4/5/18.
 */
public class 求k由a和b组成有几种组法 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int k = scanner.nextInt();
        int a = scanner.nextInt();
        int acount = scanner.nextInt();
        int b = scanner.nextInt();
        int bcount = scanner.nextInt();

        if (k % (a+b) == 0) {
            int count = k / (a+b);
            System.out.println(caclulate(acount, count)*caclulate(bcount, count));
            return;
        }

        HashSet<ArrayList<Integer>> result = new HashSet<>();
        fun(k, a, b, acount, bcount, 0, 0, result);

        int allCount = 0;
        Iterator iterator = result.iterator();
        while (iterator.hasNext()) {
            ArrayList<Integer> temp = (ArrayList<Integer>) iterator.next();
            allCount += caclulate(acount, temp.get(0)) * caclulate(bcount, temp.get(1));
        }
        System.out.println(allCount);
    }

    public static void fun(int k, int a, int b, int acount, int bcount,
        int atimes, int btimes, HashSet<ArrayList<Integer>> result) {
        if (k == 0) {
            ArrayList<Integer> times = new ArrayList<>();
            times.add(atimes);
            times.add(btimes);
            result.add(times);
        }

        if (acount > 0 && k - a >= 0) {
            fun(k-a, a, b, acount-1, bcount, atimes+1, btimes, result);
        }

        if (bcount > 0 && k - b >= 0) {
            fun(k-b, a, b, acount, bcount-1, atimes, btimes+1, result);
        }
    }

    public static int caclulate(int count, int times) {
        if (times == 1 || (count - times) == 1) {
            return count;
        }

        int result = 1;
        for (int i = times + 1; i <= count; i++) {
            result *= i;
        }

        return result;
    }
}
