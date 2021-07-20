package 排序;

import java.util.Arrays;
import java.util.Date;

public class ShellSortDemo {
    //使用交换法编写希尔排序
    public static void shellSort1(int[] arr){
        //定义辅助变量
        int temp = 0;
        int count = 0;
        for (int gap = arr.length/2; gap >0; gap/=2) {
            for (int i = gap; i < arr.length; i++) {
                //遍历各组中所有的元素，步长为gap
                for (int j = i-gap; j >=0 ; j-=gap) {
                    //如果当前元素大于加上步长后的那个元素，则交换
                    if (arr[j]>arr[j+gap]){
                        temp = arr[j];
                        arr[j] = arr[j+gap];
                        arr[j+gap] = temp;
                    }
                }
            }
        }
    }

//    public static void shellSort1(int[] arr){
//        //定义辅助变量
//        for (int gap = arr.length/2; gap >0; gap/=2) {
//
//
//        }
//    }
    //主方法测试15ms,62996ms
    public static void main(String[] args) {
        int[] arrDemo = {10,8,6,7,2,0,1,3,4,5};
//        int[] arr = new int[240000];
//        for (int i = 0; i < 240000; i++) {
//            arr[i] = (int)(Math.random()*240000);
//        }
        Date date1 = new Date();
        System.out.println(date1);
        shellSort1(arrDemo);
        Date date2 = new Date();
        System.out.println(date2);
        System.out.println("共用时"+(date2.getTime()-date1.getTime()));
        System.out.println(Arrays.toString(arrDemo));
    }
}
