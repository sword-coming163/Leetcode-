package 剑指offer.q10青蛙跳台阶问题;

public class Solution {
    //使用动态规划来解决
    public int numWays(int n) {
        int a = 1;
        int b = 2;
        int c = 0;
        if (n<=1){
            return a;
        }
        if (n==2){
            return b;
        }
        for (int i = 2; i <n; i++) {
            c = (a+b)%1000000007;
            a =b;
            b =c;
        }
        return c;
    }

    public static void main(String[] args) {
        System.out.println(new Solution().numWays(7));
    }
}
