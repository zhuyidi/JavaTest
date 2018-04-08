package Java刷题练习;


/**
 * Created by dela on 4/8/18.
 */
public class 数组中的逆序对 {
    public static void main(String[] args) {
//        int[] array = {7, 5, 6, 4};
        int[] array = {364,637,341,406,747,995,234,971,571,219,993,407,416,366,315,301,601,650,418,355,460,505,360,965,516,648,727,667,465,849,455,181,486,149,588,233,144,174,557,67,746,550,474,162,268,142,463,221,882,576,604,739,288,569,256,936,275,401,497,82,935,983,583,523,697,478,147,795,380,973,958,115,773,870,259,655,446,863,735,784,3,671,433,630,425,930,64,266,235,187,284,665,874,80,45,848,38,811,267,575};
        int result = InversePairs(array);
        System.out.println(result);
    }

    public static int InversePairs(int [] array) {
        if (array == null || array.length <= 0) {
            return 0;
        }

        int[] tmp = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            tmp[i] = array[i];
        }
        int count = InversePairsCore(array, tmp, 0, array.length-1);

        return count;
    }

    public static int InversePairsCore(int[] array, int[] tmp, int start, int end) {
        if (start == end) {
            tmp[start] = array[start];
            return 0;
        }

        int length = (end - start) / 2;

        // 为了不重复统计, 所以每一次要将tmp和array互换一下, 避免重复计数
        // 比如初始的后半段数组为 6 4
        // 在一次处理之后就会变成 4 6
        // 如果下一次传入的参还是 6 4, 那么就会将逆序对6 4多加一次,
        // 所以要将它变成 4 6再继续传入, 避免重复计数
        int left = InversePairsCore(array, tmp, start, start+length);
        int right = InversePairsCore(array, tmp, start+length+1, end);

        int i = start + length;
        int j = end;
        int k = end;
        int count = 0;

        // 比如现在有两个数组: 57 46(初始指针指向7和6, 然后再向前移)
        //                   .  .
        while (i > start && j > start+length+1) {
            if (array[i] > array[j]) {
                tmp[k--] = array[i--];
                count += j-start-length;
            } else {
                tmp[k--] = array[j--];
            }
        }

        while (i >= start) {
            tmp[k--] = array[i--];
        }

        while (j >= start+length+1) {
            tmp[k--] = array[j--];
        }

        return count + left + right;
    }
}
