package arraylist;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by dela on 11/29/17.
 */

// 关于ArrayList中数组的动态扩容
public class ArrayListInitialCapacity {
    public static void main(String[] args) {
        // ArrayList的无参构造方法默认创建一个空的Object[]数组
        ArrayList arrayList = new ArrayList();
        // 重分配Object[]数组大小
        arrayList.ensureCapacity(100);

    }
}