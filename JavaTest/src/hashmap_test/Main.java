package hashmap_test;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by dela on 3/23/18.
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner  = new Scanner(System.in);
        int num = scanner.nextInt();

        int[] temp = {1, 2, 4, 8, 16, 32, 64, 128, 256, 512, 1024, 2014};

        int i = 0;
        int result = 0;
        for (i = 0; i < 12; i++) {
            if(num < temp[i]) {
                break;
            }
            result = temp[i];
        }

        int[] test  = Arrays.copyOf(temp, i);
    }

    public static void count(int[] nums, int count) {

    }
}
