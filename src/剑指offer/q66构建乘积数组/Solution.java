package 剑指offer.q66构建乘积数组;

import java.util.Arrays;

public class Solution {
    public int[] constructArr(int[] a) {
        int[] res = new int[a.length];
        Arrays.fill(res,1);
        for (int i = 0; i < res.length; i++) {
            for (int j = 0; j < a.length; j++) {
                if (i == j){
                    continue;
                }
                res[i] = a[j]*res[i];
            }
        }
        return res;
    }
    public int[] constructArr1(int[] a) {
        if(a.length == 0) return new int[0];
        int[] b = new int[a.length];
        b[0] = 1;
        int tmp = 1;
        for(int i = 1; i < a.length; i++) {
            b[i] = b[i - 1] * a[i - 1];
        }
        for(int i = a.length - 2; i >= 0; i--) {
            tmp *= a[i + 1];
            b[i] *= tmp;
        }
        return b;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{1,2,3,4,5};
        System.out.println(Arrays.toString(new Solution().constructArr(nums)));
    }
}
