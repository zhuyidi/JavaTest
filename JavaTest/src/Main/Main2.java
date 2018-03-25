package Main;

import org.omg.CORBA.INTERNAL;

import java.util.*;

/**
 * Created by dela on 3/23/18.
 */
public class Main2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        List<Integer> list3 = new ArrayList<>();

        int num = scanner.nextInt();
        for (int j = 0; j < num; j++) {
            for (int i = 0; i < 4; i++) {
                list1.add(scanner.nextInt());
            }

            for (int i = 0; i < 4; i++) {
                list2.add(scanner.nextInt());
                list3.add(list2.get(i) - list1.get(i));
            }

            Set<Integer> test = new HashSet<>();
            for (int i = 0; i < 4; i++) {
                test.add(list3.get(i));
            }

            if (test.size() == 1) {
                System.out.println("No");
                break;
            }


            boolean mark = true;
            for (int i = 0; i < 4; i++) {
                int value = list3.get(i);
                if (!list3.contains(value * -1)) {
                    mark = false;
                }
            }

            if (mark) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        }
    }
}
