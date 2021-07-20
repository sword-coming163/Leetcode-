package 排序;

import java.util.Arrays;
import java.util.Date;

public class SelectSortDemo {
    public static void selectSort(int[] arr){

        for (int i = 0; i < arr.length; i++) {
            //定义最小的索引及对应的值
            int minIndex = i;
            int min = arr[minIndex];
            for (int j = i+1; j < arr.length; j++) {
                //比较出最小值
                if(arr[minIndex]>arr[j]){
                    minIndex = j;
                    min = arr[j];
                }
            }
            if (minIndex!=i){
                //交换最小值
                arr[minIndex] = arr[i];
                arr[i] = min;
            }

        }
    }
    //主方法测试15ms,45069ms
    public static void main(String[] args) {
//        int[] arrDemo = {10,8,6,7,2,0,1,3,4,5};
        int[] arr = new int[240000];
        for (int i = 0; i < 240000; i++) {
            arr[i] = (int)(Math.random()*240000);
        }
        Date date1 = new Date();
        System.out.println(date1);
        selectSort(arr);
        Date date2 = new Date();
        System.out.println(date2);
        System.out.println("共用时"+(date2.getTime()-date1.getTime()));
//        System.out.println(Arrays.toString(arrDemo));
    }
}
