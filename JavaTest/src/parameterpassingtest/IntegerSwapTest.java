package parameterpassingtest;

/**
 * Created by dela on 9/24/17.
 */
public class IntegerSwapTest {
    public static void swap(Integer a, Integer b){
        int temp;
        temp = a;
        a = b;
        b = temp;

        System.out.println("swap里的: a = " + a + " b = " + b);
    }

    public static void main(String[] args){
        Integer a = 3;
        Integer b = 4;

        swap(a, b);
        System.out.println("main方法里交换后的: a = " + a + " b = " + b);
    }
}
