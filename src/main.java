import java.util.Queue;
import java.util.Random;

/**
 * Created by yanfeng-mac on 2017/3/25.
 */
public class main {
    public static void main(String[] args) {
        int[] array = getRandomArray(0,100);

        printArray(array);

        System.out.println("");



        //使用快速排序
//        QuickSort.quickSort(array);

        //使用归并排序
//        MergeSort.mergeSort(array);

        //直接插入排序
//        InsertDirectly.insertDirectly(array);

        //二分插入排序
//        TwoPointInsertSort.sort(array);
//        main.printArray(array);

        //希尔排序
        ShellInsertSort.sort(array);





    }

    public static int[] getRandomArray (int min,int max) {
        Random random = new Random();
        int[] array = new int[10];

        for(int i = 0;i < 10;i++) {
            int item = random.nextInt(max) % (max - min + 1) + min;
            array[i] = item;
        }

        return array;
    }

    public static void printArray(int[] array) {
        for (int i = 0;i < array.length;i++) {
            System.out.print(array[i] + " ");
        }
    }
}
