package Main;

import java.util.Scanner;

/**
 * Created by dela on 3/24/18.
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner  = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        int h = scanner.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }


        int result = 0;
        height(result, k, arr, 0, 0);
        System.out.println(result);

    }

    public static int height(int result, int k, int[] arr, int index, int initH) {
        if (k <= 0) {
            return initH;
        }

        result = initH + (arr[index]-initH) * 2;
        System.out.println(result);
        height(result, --k, arr, ++index, result);
        return 0;
    }
}
