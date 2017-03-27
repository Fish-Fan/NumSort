/**
 * Created by yanfeng-mac on 2017/3/25.
 */
public class QuickSort {
    public static int partition(int low,int high,int array[]) {
        int pivot = array[low];

        while (low < high) {
            while(low < high && array[high] >= pivot)
                high--;

            array[low] = array[high];

            while (low < high && array[low] <= pivot)
                low++;
            array[high] = array[low];
        }

        array[low] = pivot;
        return low;
    }

    public static void qsort(int low,int high,int[] array) {
        //设置low < high 是确定递归调用只有有两个个数时不可再分，即至少有两个数完成排序
        if(low < high) {
            int pivot = partition(low,high,array);
            qsort(low,pivot-1,array);
            qsort(pivot+1,high,array);
        }
    }

    public static void quickSort(int[] array) {
        qsort(0,array.length-1,array);
        for(int i = 0;i < array.length;i++){
            System.out.print(array[i] + " ");
        }
    }
}






