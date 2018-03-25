package Main;

/**
 * Created by dela on 3/15/18.
 */
public class Qsort {
//    public static void qsort(int[] arr, int _low, int _high) {
//           int low = _low;
//           int high = _high;
//           int temp = 0;
//
//           if(low <= high) {
//               temp = arr[low];
//
//               // 从左右两端交替扫描, 直到left = right;
//               while(low != high) {
//
//                   while(high > low && arr[high] >= temp) {
//                       high--;
//                   }
//                   arr[low] = arr[high];
//
//                   while(low < high && arr[low] <= temp) {
//                       low++;
//                   }
//                   arr[high] = arr[low];
//               }
//
//               arr[high] = temp;
//               qsort(arr, _low, low-1);
//               qsort(arr, low+1, _high);
//           }
//    }

    public static void qsort(int[] arr, int _low, int _high) {
        int low = _low;
        int high = _high;
        int temp = 0;
        temp = arr[low];

        if(low < high) {
            while(low != high) {


                while(high > low && arr[high] >= temp) {
                    high--;
                }
                arr[low] = arr[high];

                while(low < high && arr[low] <= temp) {
                    low++;
                }
                arr[high] = arr[low];
            }
            arr[high] = temp;
            qsort(arr, _low, low-1);
            qsort(arr, low+1, _high);
        }
    }

    public static void main(String[] args) {
        int arr[] = {5, 6, 7, 8, 1, 0, 4, 8, 5, 9};

//        quickSort(arr, 0, 9);

        qsort(arr, 0, 9);
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}
