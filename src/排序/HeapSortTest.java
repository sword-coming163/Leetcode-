package 排序;

import java.util.Arrays;

public class HeapSortTest {
    public void HeapSort(int[] nums){
        buildHeap(nums);
        System.out.println(Arrays.toString(nums));
        for (int i = nums.length-1; i >=0; i--) {
            int temp = nums[i];
            nums[i] = nums[0];
            nums[0] = temp;
            adjust(nums,0,i);
        }
        System.out.println(Arrays.toString(nums));
    }
    public void buildHeap(int[] nums){
        for (int i = nums.length/2-1; i >=0; i--) {
            adjust(nums,i,nums.length);
        }
    }
    public void adjust(int[] nums,int i,int length){
        int temp = nums[i];
        for (int k = 2*i+1; k < length; k = k*2+1) {
            if (k+1<length&&nums[k]<nums[k+1]){
                k++;
            }
            if (nums[k]>temp){
                nums[i] = nums[k];
                i = k;
            }else {
                break;
            }
        }
        nums[i] = temp;
    }

    public static void main(String[] args) {
        int[] nums = new int[24];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = (int) (Math.random()*24);
        }
        HeapSortTest heapSortTest = new HeapSortTest();
        heapSortTest.HeapSort(nums);
    }
}
