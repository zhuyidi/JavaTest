package Main;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;
import java.util.concurrent.BlockingDeque;
import java.util.concurrent.LinkedBlockingDeque;

/**
 * Created by dela on 3/22/18.
 */
public class Main1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Set num = new TreeSet();
        for (int i = 0; i < 10; i++) {
            num.add((char) i);
        }

        Set inputNum = new TreeSet();
        String numStr = scanner.next();
        char[] charNum = numStr.toCharArray();
        for (int i = 0; i < charNum.length; i++) {
            inputNum.add(charNum[i]);
        }

        num.removeAll(inputNum);

        if (num.size() == 1) {
            Object result = num.iterator().next();

            if (result == "0") {
                System.out.println((char)inputNum.iterator().next() + "0");
                return;
            }

            System.out.println(num.iterator().next());
        } else if (num.size() > 0) {
            int i = 0;
            Object result = 0;
            for (Object j : num) {
                result =  j;
                i++;
                if (i == 2) {
                    break;
                }
            }

            System.out.println((char)result);
            return;
        } else if (num.size() == 0) {
            char mark = charNum[0];
            StringBuilder sb = new StringBuilder();
            sb.append(mark);

            for (int i = 1; i < charNum.length; i++) {
                if (mark != charNum[i]) {
                    break;
                }
                sb.append(charNum[i]);
            }

            sb.append(0);
            System.out.println(sb.toString());
        }


    }
}
