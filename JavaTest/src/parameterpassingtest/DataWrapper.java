package parameterpassingtest;

/**
 * Created by dela on 9/24/17.
 */
public class DataWrapper {
    public int a;
    public int b;

    public static void swap(DataWrapper A){
        int temp;

        temp = A.a;
        A.a = A.b;
        A.b = temp;

        System.out.println("swap里的: a = " + A.a + " b = " + A.b);
    }

    public static void swap(DataWrapper A, DataWrapper B){
        int temp;
        temp = A.a;
        A.a = B.a;
        B.a = temp;

        System.out.println("swap里的: A.a = " + A.a + " B.a = " + B.a);
    }

    public static void main(String[] args){
        DataWrapper A = new DataWrapper();
        DataWrapper B = new DataWrapper();

        A.a = 3;
        A.b = 4;
        B.a = 5;
        B.b = 6;

//        swap(A);
        swap(A, B);

//        System.out.println("main方法里交换后的: a = " + A.a + " b = " + A.b);
        System.out.println("main方法里交换后的: A.a = " + A.a + " B.a = " + B.a);
    }
}
