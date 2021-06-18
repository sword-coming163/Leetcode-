package 剑指offer.q15二进制中1的个数.training;

public class Solution {
    public double myPow(double x, int n) {
        long longn = n;
        if(n>0){
            return zhengPow(x,longn);
        }else if(n<0){
            return 1/(zhengPow(x,-longn));
        }else{
            return 1;
        }
    }
    public double zhengPow(double x, long n){
//        递归运算
        double res = 1.0;
        if (n==1){return x;}
        //偶数
        if (n%2==0){
            res = zhengPow(x,n/2);
            res = res*res;
        }else if (n%2==1){
            res = zhengPow(x,n/2);
            res = res * res *x;
        }
        return res;
    }
    public double myPow1(double x, int n) {
        if(x == 0) return 0;
        long b = n;
        double res = 1.0;
        if(b < 0) {
            x = 1 / x;
            b = -b;
        }
        while(b > 0) {
            if((b & 1) == 1) res *= x;
            x *= x;
            b >>= 1;
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(new Solution().myPow1(2,31));
    }
}
