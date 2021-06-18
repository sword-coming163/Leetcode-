package 排序;

import java.util.Arrays;
import java.util.Date;

public class quickTest {
    public void quickSort(int[] nums){
        sort(nums,0,nums.length-1);
    }
    public void sort(int[] nums,int l,int r){
        if (l>=r){
            return;
        }
        int pivot = partition(nums,l,r);
        sort(nums,l,pivot-1);
        sort(nums,pivot+1,r);
    }
    public int partition(int[] nums,int l,int r){
        int index = l;
        int pivot = nums[l];
        for (int i = l+1; i <= r; i++) {
            if (nums[i]<pivot){
                //交换
                index++;
                int temp = nums[index];
                nums[index] = nums[i];
                nums[i] = temp;
            }
        }
        //交换坑位位置
        nums[l] = nums[index];
        nums[index] = pivot;
        return index;
    }

    public static void main(String[] args) {
        int[] nums = new int[24];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = (int) (Math.random()*24);
        }

        quickTest quickTest = new quickTest();
        Date start = new Date();
        quickTest.quickSort(nums);
        Date end = new Date();
        System.out.println(end.getTime()-start.getTime());
        System.out.println(Arrays.toString(nums));
    }
}
