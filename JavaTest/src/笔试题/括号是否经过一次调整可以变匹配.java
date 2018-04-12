package 笔试题;

import java.util.Scanner;

/**
 * Created by dela on 4/9/18.
 */

public class 括号是否经过一次调整可以变匹配 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            String s = scanner.next();
            char[] tmp = s.toCharArray();
            if(tmp.length == 2){
                if(tmp[0] == '(')
                    System.out.println("No");
                else
                    System.out.println("Yes");
                continue;
            }

            if(func(tmp)){
                System.out.println("Yes");
                continue;
            }

            int l = 0;
            int r = 0;
            int c = 0;

            int length = tmp.length;
            for(int j = 0; j < length; j++){
                if(tmp[j] == '(')
                    c++;
                else
                    c--;
                if(c < 0){
                    l = j;
                    break;
                }
            }

            for(int j = length-1; j >= 0; j--){
                if(tmp[j] == ')')
                    c++;
                else
                    c--;
                if(c < 0){
                    r = j;
                    break;
                }
            }
            char t = tmp[l];
            tmp[l] = tmp[r];
            tmp[r] = t;

            if(func(tmp)){
                System.out.println("Yes");
            }else{
                System.out.println("No");
            }
        }
    }

    public static boolean func(char[] str) {
        int c = 0;
        int length = str.length;

        for(int i = 0; i < length; i++){
            if(str[i] == '(')
                c++;
            else
                c--;

            if(c < 0)
                return false;
        }

        if(c != 0)
            return false;
        else
            return true;
    }
}
