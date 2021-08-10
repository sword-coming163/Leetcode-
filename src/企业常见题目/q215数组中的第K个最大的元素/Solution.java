package 企业常见题目.q215数组中的第K个最大的元素;

import java.util.Arrays;
import java.util.PriorityQueue;

/**
 * @author zhang
 * @title: Solution
 * @projectName Leetcode-
 * @description: TODO
 * @date 2021/7/31:9:32
 */
public class Solution {
    public int findKthLargest(int[] nums, int k) {
        //使用优先队列实现构建小顶堆，默认就是小顶堆 默认a-b
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();
        if (nums==null||nums.length==0){
            return 0;
        }
        for (int i = 0; i <k; i++) {
            priorityQueue.offer(nums[i]);
        }
        for (int i = k; i < nums.length ; i++) {
            if (priorityQueue.peek()<nums[i]){
                priorityQueue.poll();
                priorityQueue.offer(nums[i]);
            }
        }
        return priorityQueue.peek();
    }

    public static void main(String[] args) {
        int[] nums = new int[]{3,2,3,1,2,4,5,5,6};
        System.out.println(new Solution().findKthLargest(nums,4));
    }
}
