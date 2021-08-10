package 企业常见题目.q179最大数;

import java.util.Arrays;

/**
 * @author zhang
 * @title: Solution
 * @projectName Leetcode-
 * @description: TODO
 * @date 2021/7/31:14:13
 */
public class Solution {
    public String largestNumber(int[] nums) {
        int n = nums.length;
        String[] ss = new String[n];
        for (int i = 0; i < n; i++) {
            ss[i] = "" + nums[i];
        }
        Arrays.sort(ss, (a, b) -> {
            String sa = a + b, sb = b + a ;
            return sb.compareTo(sa);
        });

        StringBuilder sb = new StringBuilder();
        for (String s : ss) {
            sb.append(s);
        }
        int len = sb.length();
//        return sb.toString();
        int k = 0;
        while (k < len - 1 && sb.charAt(k) == '0') {
            k++;
        }
        return sb.substring(k);
    }


    public static void main(String[] args) {
        int[] nums = new int[]{111311,1113};
        System.out.println(new Solution().largestNumber(nums));
    }
}
