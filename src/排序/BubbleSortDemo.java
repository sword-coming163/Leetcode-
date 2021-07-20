package 排序;

import java.util.Arrays;
import java.util.Date;

/**
 * @author zhang
 * @des 冒泡排序
 */
public class BubbleSortDemo {
    public static void bubbleSort(int[] arr){
        //定义临时变量
        int temp = 0;
        //优化，判断是否一次都没有交换
        boolean flag = false;
        System.out.println(Arrays.toString(arr));
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = 0; j < arr.length-1-i; j++) {
                if (arr[j]>arr[j+1]){
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    flag = true;
                }
            }
            if (!flag){
                break;
            }else {
                flag = false;//方便下次判断
            }
            System.out.println(Arrays.toString(arr));
        }
    }
    //主方法测试15ms,108345ms
    public static void main(String[] args) {
        int[] arrDemo = {10,8,6,7,2,0,1,3,4,5};
//        int[] arr = new int[240000];
//        for (int i = 0; i < 240000; i++) {
//            arr[i] = (int)(Math.random()*240000);
//        }
//        Date date1 = new Date();
//        System.out.println(date1);
        bubbleSort(arrDemo);
//        Date date2 = new Date();
//        System.out.println(date2);
//        System.out.println("共用时"+(date2.getTime()-date1.getTime()));
//        System.out.println(Arrays.toString(arrDemo));


    }
}
