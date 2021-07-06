package 剑指offer.q59滑动窗口的最大值;

import java.util.Arrays;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;


public class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        if (nums==null||nums.length<k||k==0){
            return new int[0];
        }
        int len = nums.length;
        MaxQueue maxQueue = new MaxQueue();
        int[] res = new int[len-k+1];
        for (int i = 0; i < k; i++) {
            maxQueue.push_back(nums[i]);
        }
        res[0] = maxQueue.max_value();
        for (int i = k; i < len; i++) {
            maxQueue.push_back(nums[i]);
            maxQueue.pop_front();
            res[i-k+1] = maxQueue.max_value();
        }

        return res;
    }
    class MaxQueue {
        //申请两个链表实现队列
        Queue<Integer> q;
        Deque<Integer> d;

        public MaxQueue() {
            q = new LinkedList<Integer>();
            d = new LinkedList<Integer>();
        }

        public int max_value() {
            if (d.isEmpty()) {
                return -1;
            }
            return d.peekFirst();
        }

        public void push_back(int value) {
            while (!d.isEmpty() && d.peekLast() < value) {
                d.pollLast();
            }
            d.offerLast(value);
            q.offer(value);
        }
        public boolean isEmpty(){
            if (d.isEmpty()){
                return true;
            }else {
                return false;
            }
        }

        public int pop_front() {
            if (q.isEmpty()) {
                return -1;
            }
            int ans = q.poll();
            if (ans == d.peekFirst()) {
                d.pollFirst();
            }
            return ans;
        }
    }

    public static void main(String[] args) {
        int[] nums = new int[]{1,-1};
        System.out.println(Arrays.toString(new Solution().maxSlidingWindow(nums,1)));
    }
}


