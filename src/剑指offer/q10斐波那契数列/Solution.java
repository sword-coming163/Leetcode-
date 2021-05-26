package 剑指offer.q10斐波那契数列;

public class Solution {
    //递归
    public int fib(int n) {
        if (n==0){
            return 0;
        }
        if (n==1){
            return 1;
        }
        return (fib(n-1)+fib(n-2))%1000000007;
    }
    //迭代
    public int fib1(int n){
        int a = 0;
        int b = 1;
        int c = 0;
        if (n==1){
            return 1;
        }
        for (int i = 0; i < n-1; i++) {
            c =(a+b)%1000000007;
            a= b;
            b = c;

        }
//        System.out.println(c);
        return c;
    }

    public static void main(String[] args) {
        System.out.println(new Solution().fib1(1000000008));
    }
}
