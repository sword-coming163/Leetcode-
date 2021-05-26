package 剑指offer.q17打印从1到最大n位数;

import java.util.Arrays;

public class Solution {
    public int[] printNumbers(int n) {
        int max= (int) Math.pow(10,n);
        int[] nums = new int[max-1];
        for (int i = 0; i < max-1; i++) {
            nums[i]=i+1;
        }
        return nums;
    }

    public static void main(String[] args) {
        System.out.println(new Solution().printNumbers1(3));
    }
    StringBuilder res;
    int nine = 0, count = 0, start, n;
    char[] num, loop = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9'};
    public String printNumbers1(int n) {
        this.n = n;
        res = new StringBuilder();
        num = new char[n];
        start = n - 1;
        dfs(0);
        res.deleteCharAt(res.length() - 1);
        return res.toString();
    }
    void dfs(int x) {
        if(x == n) {
            String s = String.valueOf(num).substring(start);
            if(!s.equals("0")) res.append(s + ",");
            if(n - start == nine) start--;
            return;
        }
        for(char i : loop) {
            if(i == '9') nine++;
            num[x] = i;
            dfs(x + 1);
        }
        nine--;
    }
}
