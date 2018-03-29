package 递归;

/**
 * Created by dela on 3/29/18.
 */
public class Fibonacci {
    public static void main(String[] args) {
        int n = 4;
        System.out.println(getNumber(n));
    }

    public static int getNumber(int n) {
        if (n == 1 | n == 2) {
            return 1;
        }

        return getNumber(n-1) + getNumber(n-2);
    }
}
