package 剑指offer.q42连续子数组的最大和.training;

import java.util.*;

/**
 * @author zhang
 * @title: Solution
 * @projectName Leetcode-
 * @description: TODO
 * @date 2021/7/19:14:58
 */
public class Solution {
//    public int maxSubArray(int[] nums) {
//        if (nums.length==1){
//            return nums[0];
//        }
//        //使用动态规划解决
//        int[] dp= nums;
//        int max = Integer.MIN_VALUE;
//        for (int i = 1; i < nums.length; i++) {
//            dp[i] = Math.max(dp[i-1]+nums[i],dp[i]);
//            max = Math.max(max,dp[i]);
//        }
//        return max;
//    }
//    public int getRow(int K,int k) {
//        List<Integer> row = new ArrayList<Integer>();
//        row.add(1);
//        for (int i = 1; i < K; ++i) {
//            row.add(0);
//            for (int j = i; j > 0; --j) {
//                row.set(j, row.get(j) + row.get(j - 1));
//            }
//        }
//        System.out.println(row);
//        return row.get(k-1);
//    }
////    public int getRow(int K,int J) {
//        List<Integer> row = new ArrayList<Integer>();
//        row.add(1);
//        for (int i = 1; i < K; ++i) {
//            row.add((int) ((long) row.get(i - 1) * (K - i ) / i));
//            System.out.println(row);
//        }
//        return row.get(J-1);
//    }
//    public int[] ans(String s){
//        if (s==null||s.length()==0){
//            return new int[1];
//        }
//        int row = 0;
//        int col = 0;
//        int temp = 1;
//
//        for (int i = 0; i < s.length(); i++) {
//            int t = i;
//            while (s.charAt(i)>'0'&&s.charAt(i)<'9'){
//                if (i+1<s.length()&&s.charAt(i+1)>='0'&&s.charAt(i+1)<'9'){
//                    i++;
//                    temp = Integer.parseInt(s.substring(t,i+1));
//                }else {
//                    temp = Integer.parseInt(s.substring(t,i+1));
//                    break;
//                }
//            }
//
//            System.out.println(temp);
//            if (s.charAt(i)=='W'){
//                col = col+temp;
//                temp = 1;
//
//
//            }else if (s.charAt(i)=='S'){
//                col = col-temp;
//                temp = 1;
//
//            }
//            else if (s.charAt(i)=='D'){
//                row = row+temp;
//                temp = 1;
//
//            }else if (s.charAt(i)=='A'){
//                row = row-temp;
//                temp = 1;
//
//            }
//        }
//        return new int[]{row,col};
//    }
    public static void main(String[] args) {
//        int[] nums = new int[]{-2,1,-3,4,-1,2,1,-5,4};
//        System.out.println(new Solution().maxSubArray(nums));
//        System.out.println(Arrays.toString(new Solution().ans("20W22D")));
    }
}
