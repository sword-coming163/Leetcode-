package 笔试.shoope.q3;

import java.util.Arrays;

/**
 * @author zhang
 * @title: Solution
 * @projectName Leetcode-
 * @description: TODO
 * @date 2021/8/2:19:34
 */
public class Solution {
    public int findBalancedIndex(int[] inputArray) {
        // write code here
        int total = Arrays.stream(inputArray).sum();
        int sum = 0;
        for (int i = 0; i < inputArray.length; i++) {
            if (2*sum+inputArray[i]==total){
                return i;
            }else if (2*sum+inputArray[i]>total) {
                return -1;
            }else {
                sum = sum+inputArray[i];
            }
        }
        return -1;
    }
}
