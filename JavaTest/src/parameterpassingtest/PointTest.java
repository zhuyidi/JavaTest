package parameterpassingtest;

/**
 * Created by dela on 9/22/17.
 */
public class PointTest {
    private int num1;
    private int num2;

    public static void main(String[] args){
        int num1 = 1;
        int num2 = 2;
        String str = "111";

        PointTest p1 = new PointTest();
        p1.change(num1, num2);
        p1.change(str);
        System.out.println(num1);
        System.out.println(num2);
        System.out.println(str);
    }

    public void change(int num1, int num2){
        int temp;
        temp = num1;
        num1 = num2;
        num2 = temp;


    }

    public void change(String str){
        str = "222";
    }

}
