package 剑指offer.q10青蛙跳台阶问题.training;

import org.junit.Test;

/**
 * @author zhang
 * @title: Solution
 * @projectName Leetcode-
 * @description: TODO
 * @date 2021/8/6:16:14
 */
public class Solution {
    public int numWays(int n) {
        if (n==0){
            return 1;
        }
        int a = 1;
        int b = 1;
        int c = 1;
        for(int i = 1;i<n;i++){
            c = (a+b)%1000000007;
            a = b;
            b = c;
        }
        return c;
    }
    @Test
    public void Test(){
        System.out.println(numWays(1));
    }
}
