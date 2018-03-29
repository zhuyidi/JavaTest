package 递归;

/**
 * Created by dela on 3/29/18.
 */
public class ArraySum {
    public static void main(String[] args) {
        int[] arr = {0, 1, 2, 3, 4};

        System.out.println(sum(arr, 0, 4));
    }

    public static int sum(int[] arr, int start, int end) {
        if (start == end) {
            return arr[start];
        }

        return arr[start] + sum(arr, start+1, end);
    }
}
