/**
 * Created by yanfeng-mac on 2017/3/27.
 */
public class ShellInsertSort {
    public static void sort(int[] array) {
        int d = array.length;
        while (true) {
            d = d / 2;

            //控制每次改变d后循环的次数
            for(int x = 0;x < d;x++) {
                //遍历间距为d的数组
                for(int i = x+d;i < array.length;i = i+d) {
                    int temp = array[i];
                    int j;


                    for(j = i-d;j >=0 && array[j] > temp;j = j-d) {
                        array[j+d] = array[j];
                    }

                    array[j+d] = temp;
                }
            }

            if(d == 1)
                break;
        }

        main.printArray(array);
    }
}
