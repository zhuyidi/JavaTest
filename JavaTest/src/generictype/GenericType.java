package generictype;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by dela on 11/28/17.
 */
//泛型通配符的使用
public class GenericType {
    public static void main(String[] args) {
        List<?> c = new ArrayList<Object>();
        List<String> c1 = new ArrayList<String>();

        c1.add("hello");
        c1.add("world");
        c = c1;

        //c.add("!"); //使用型通配符的类只能接收一个泛型类型, 但是不能再增加(add)被赋值的泛型类(但是可以删除和获取(remove和get)).
        c.remove("hello");

        for(Object object : c){
            System.out.println(object);
        }
    }
}
