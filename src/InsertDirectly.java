/**
 * Created by yanfeng-mac on 2017/3/25.
 */

public class InsertDirectly {
    public static void insertDirectly(int[] array) {
        for(int i = 0;i < array.length;i++) {
            int temp = array[i];
            int j;

            for(j = i - 1;j >= 0;j--) {
                if(array[j] > temp)
                    array[j+1] = array[j];
                //else判断不能丢
                else
                    break;
            }

            //array[j+1]是因为循环体内的j--
            array[j+1] = temp;
        }

        main.printArray(array);
    }
}





