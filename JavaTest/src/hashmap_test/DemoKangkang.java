package hashmap_test;

import java.util.*;

/**
 * Created by dela on 12/8/17.
 */
public class DemoKangkang {
    public static void main(String[] args) {
        Map<Kangkang, Integer> kang = new TreeMap<>();
        Kangkang kangkang1 = new Kangkang(1);
        Kangkang kangkang2 = new Kangkang(2);
        Kangkang kangkang3 = new Kangkang(3);

//        Number a = 0;
//        Integer

        String a = "";
//        System.out.println(kangkang1);
//        System.out.println(kangkang2);
        


        System.out.println(kang.put(kangkang1, 9));
        System.out.println(kang.put(kangkang2, 2));
        System.out.println(kang.put(kangkang3, 8));

        System.out.println(kang);


    }
}
