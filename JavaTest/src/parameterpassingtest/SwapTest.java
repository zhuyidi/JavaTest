package parameterpassingtest;

/**
 * Created by dela on 9/23/17.
 */
public class SwapTest {
    public static void swap(int a, int b){
        int temp;

        temp = a;
        a = b;
        b = temp;

        System.out.println("swap里的: a = " + a + " b = " + b);
    }

    public static void main(String[] args){
        int a = 3;
        int b = 4;

        swap(3, 4);
        System.out.println("main方法里交换后的: a = " + a + " b = " + b);
    }
}
