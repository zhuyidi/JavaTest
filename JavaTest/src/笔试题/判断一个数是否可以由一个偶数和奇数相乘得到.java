package 笔试题;

import java.util.Scanner;

/**
 * Created by dela on 4/9/18.
 */

public class 判断一个数是否可以由一个偶数和奇数相乘得到 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int t = scanner.nextInt();
        for (int i = 0; i < t; i++) {
            long n = scanner.nextLong();

            if(n%2 != 0){
                System.out.println("No");
                continue;
            }

            long p = 2;
            while(n >= p){
                if(n % p == 0 && (n/p)%2 == 1){
                    System.out.println(n/p + " " + p);
                    break;
                }else
                    p *= 2;
            }
        }
    }
}
