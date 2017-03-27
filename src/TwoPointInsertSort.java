/**
 * Created by yanfeng-mac on 2017/3/26.
 */
public class TwoPointInsertSort {
    public static void sort(int[] array) {
        for(int i = 0;i < array.length;i++) {
            int temp = array[i];
            int left = 0;
            int right = i - 1;


            while (left <= right) {
                int mid = (left + right) / 2;
                if(array[mid] < temp) {
                    left = mid + 1;
                } else {
                    right = mid - 1;
                }
            }

            //比array[i]大的全部向前挪位
            for(int j = i - 1;j >= left;j--) {
                array[j+1] = array[j];
            }

            //比array[i]大的数全部挪位之后，将array[i]放置在正确的位置
            array[left] = temp;

        }
    }

}


