package 笔试题;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Stack;
import java.util.TreeMap;

/**
 * Created by dela on 4/9/18.
 */


// 竟然10%了!!!! 算逑呢!!!! 算逑呢!!!! 我真的想不出来了!!!!!
    // 这个题写的我肝都颤了!!!!!!

public class 变成回文串的方案数 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String tmp = scanner.next();
        char[] str = tmp.toCharArray();

        if (str.length == 1) {
            System.out.println(1);
            return;
        }

        boolean mark = judge(str);
        if (mark == true) {
            System.out.println(str.length + 2);
            return;
        }

        System.out.println(func(str));
    }

    public static int func(char[] str) {
        if (str.length == 1) {
            return 1;
        }

        int result = 0;

        return result;
    }

    public static boolean judge(char[] str) {
        int len = str.length;
        Stack<Character> stack = new Stack<>();
        int i = 0;

        for(i = len/2-1; i >= 0; i--)
        {
            stack.push(str[i]);
        }

        i = len - 1;
        while(!stack.empty())
        {
            char tmp = stack.pop();

            if(tmp != str[i--])
            {
                return false;
            }
        }
        return true;
    }
}
