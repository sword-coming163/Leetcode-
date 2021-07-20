package 排序;

import java.util.Arrays;
import java.util.Date;

public class InsertSortDemo {
    public static void insertSort(int[] arr){
        //定义插入值及插入索引
        int insertValue = 0;
        int insertIndex = 0;
        for (int i = 1; i < arr.length; i++) {
            insertValue = arr[i];
            insertIndex = i-1;
            // 插入值
            while (insertIndex>=0 && insertValue < arr[insertIndex]){
                arr[insertIndex+1] = arr[insertIndex];
                insertIndex--;
            }
            //判断是否需要赋值
            if (insertIndex+1!=i){
                arr[insertIndex+1] = insertValue;
            }
//            System.out.println("第"+i+"轮插入");
//            System.out.println(Arrays.toString(arr));
        }
    }
    //主方法测试15ms,6450ms
    public static void main(String[] args) {
//        int[] arrDemo = {10,8,6,7,2,0,1,3,4,5};
        int[] arr = new int[240000];
        for (int i = 0; i < 240000; i++) {
            arr[i] = (int)(Math.random()*240000);
        }
        Date date1 = new Date();
        System.out.println(date1);
        insertSort(arr);
        Date date2 = new Date();
        System.out.println(date2);
        System.out.println("共用时"+(date2.getTime()-date1.getTime()));
//        System.out.println(Arrays.toString(arrDemo));


    }
}
