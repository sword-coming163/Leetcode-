package 数字操作.q69X的平方根;

import org.junit.Test;

/**
 * @author zhang
 * @title: Solution
 * @projectName Leetcode-
 * @description: TODO
 * @date 2021/8/5:20:32
 */
public class Solution {
    public int mySqrt(int x) {
        if (x==0||x==1){
            return x;
        }
        for (long i = 1; i <= x; i++) {
            if (i*i>x){
                return (int) i-1;
            }
        }
        return 0;
    }
    /**
      * @param x
      * @description: 使用二分查找
      * @return {@link int}
      * @throws
      * @author zhang
      * @date 2021/8/5 20:42
     */
    public int mySqrt1(int x) {
        if (x==0||x==1){
            return x;
        }
        int left = 0;
        int right = x;
        long mid = 0;
        while (left<=right){
            mid = left+(right-left)/2;
            if (mid*mid>x){
                right = (int) mid-1;
            }else if (mid*mid<x){
                left = (int)mid+1;
            }else {
                return (int) mid;
            }
        }
        return left-1;
    }
    @Test
    public void test(){
//        System.out.println(46340*46340);
//        2147395600
        System.out.println(mySqrt1(2147395600));
    }
}
