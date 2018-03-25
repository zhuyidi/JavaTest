package mergesortarray;

import java.util.HashMap;

/**
 * Created by dela on 3/19/18.
 */
public class Main {
    public static void main(String[] args) {
        int a =3;
        int b = 4;
        swap(a, b);
        System.out.println(a +  " " + b);
    }

    public static void swap(int a, int b) {
        int temp = a;
        a = b;
        b = temp;
    }
}
