package 排序;

import java.util.Arrays;
import java.util.Date;

public class HeapSort {
    public static void main(String[] args) {

        //创建一个80000个随机数组成的数组
        int[] arr = new int[]{4,6,8,5,9};
//        for (int i = 0; i < 8; i++) {
//            arr[i] = (int) (Math.random() * 8);
//        }
        Date date1 = new Date();
        heapSort(arr);
        Date date2 = new Date();

        System.out.println(Arrays.toString(arr));
    }
    public static void heapSort(int arr[]) {
        int temp = 0;
        for (int i = arr.length / 2 - 1; i >= 0; i--) {
            adjustHeap(arr, i, arr.length);
        }
        for (int j = arr.length - 1; j > 0; j--) {
            //交换
            temp = arr[j];
            arr[j] = arr[0];
            arr[0] = temp;
            adjustHeap(arr, 0, j);
        }
    }
    public static void adjustHeap(int arr[], int i, int length) {
        int temp = arr[i];
        for (int k = i * 2 + 1; k < length; k = k * 2 + 1) {
            if (k + 1 < length && arr[k] < arr[k + 1]) {
                k++;//k指向右子结点
            }
            if (arr[k] > temp) {//如果子结点大于父结点
                arr[i] = arr[k];//把较大的值赋值给当前结点
                i = k;//i指向k，继续循环比较
            } else {
                break;
            }
        }
        arr[i] = temp;//将temp值放到调整后的位置
    }
}
