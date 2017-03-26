/**
 * Created by yanfeng-mac on 2017/3/25.
 */
public class MergeSort {
    public static void merge(int left,int right,int center,int array[]) {
        int[] tempArr = new int[array.length];
        //最后复制数组的时用到的索引值
        int temp = left;
        //右数组的首索引
        int mid = center + 1;
        //新建数组的索引值
        int index = left;

        //利用left和mid来进行光标移动,center和right不变，是坐标
        while (left <= center && mid <= right) {
            if(array[left] <= array[mid]){
                tempArr[index++] = array[left++];
            } else {
                tempArr[index++] = array[mid++];
            }
        }

        while (left <= center) {
            tempArr[index++] = array[left++];
        }

        while (mid <= right) {
            tempArr[index++] = array[mid++];
        }

        while (temp <= right) {
            array[temp] = tempArr[temp++];
        }

    }

    public static void sort(int left,int right,int array[]) {
        //设置left >= right break是为了防止递归调用时每组只剩下一个数的情况下继续递归调用，即确定每组至少有一个数
        if(left >= right)
            return;

        int center = (left + right) / 2;

        sort(left,center,array);
        sort(center+1,right,array);

        merge(left,right,center,array);
    }

    public static void mergeSort(int[] array) {
        sort(0,array.length-1,array);
        main.printArray(array);
    }
}






