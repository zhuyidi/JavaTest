package hashmap_test;

import java.util.HashMap;

/**
 * Created by dela on 12/8/17.
 */
public class Kangkang implements Comparable<Kangkang> {
    private String name;
    private int age;

    public Kangkang(int age) {
        this.age = age;
    }

    @Override
    public int hashCode() {
        return 1;
    }

    @Override
    public boolean equals(Object obj) {
        return this.hashCode() == obj.hashCode();
    }

    @Override
    public int compareTo(Kangkang o) {
        return 0;
    }
}
