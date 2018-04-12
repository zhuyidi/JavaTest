package 笔试题;

/**
 * Created by dela on 4/12/18.
 */
public class test {
    public synchronized void m1() {
        System.out.println("m1");
        m2();
    }

    public synchronized void m2() {
        System.out.println("m2");
    }

    public static void main(String[] args) {
        test test = new test();
        test.m1();
    }
}
