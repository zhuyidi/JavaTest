package 笔试题;

import java.util.Scanner;

/**
 * Created by dela on 3/29/18.
 */
public class 判断str是否由sub循环组成 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();
        char[] chars = str.toCharArray();
        int i = 0;
        int j = chars.length - 1;
        boolean mark = true;

        if (chars.length == 1) {
            System.out.println(chars);
            return;
        }

        while (!(chars[i+1] == chars[j] && chars[j] == chars[0])) {
            i++;
            j--;
        }
        System.out.println("i:" + i + ", j:" + j);

        String sub = str.substring(0, i+1);

        int k = 0;

        while (k < str.length()) {
            String temp = str.substring(k, k+sub.length());
            if(!temp.equals(sub)) {
                mark = false;
                break;
            }
            k += sub.length();
        }

        if (mark) {
            System.out.println(sub);
        } else {
            System.out.println("false");
        }
    }
}
