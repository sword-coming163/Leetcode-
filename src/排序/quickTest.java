package 排序;

import java.util.Arrays;
import java.util.Date;

public class quickTest {
    private void sort(int[] nums,int l,int r){
        if(l>=r){
            return;
        }
        int p = partition(nums,l,r);
        sort(nums,l,p-1);
        sort(nums,p+1,r);
    }
    private int partition(int[] nums,int l,int r){
        int pivot = nums[l];
        int index = l;
        for (int i = l+1; i <r+1; i++) {
            if (nums[i]<pivot){
                index++;
                int temp = nums[i];
                nums[i] = nums[index];
                nums[index] = temp;
            }
        }
        nums[l] = nums[index];
        nums[index] = pivot;
        return index;
    }
    public void quickSort(int[] nums){
        sort(nums,0,nums.length-1);
    }

    public static void main(String[] args) {
        int[] nums = new int[240000];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = (int) (Math.random()*240000);
        }

        quickTest quickTest = new quickTest();
        Date start = new Date();
        quickTest.quickSort(nums);
        Date end = new Date();
        System.out.println(end.getTime()-start.getTime());
//        System.out.println(Arrays.toString(nums));
    }
}
