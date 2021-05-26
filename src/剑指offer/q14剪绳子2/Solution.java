package 剑指offer.q14剪绳子2;

public class Solution {
    public int cuttingRope(int n) {
        int a = n/3;
        int b = n%3;
        if (n<=3){return n-1;}
        if (b==0){return chengfang(a);}
        if (b==1){return (((chengfang(a-1)*2)%1000000007)*2)%1000000007;}
        if (b==2){return (chengfang(a)*2)%1000000007;}
        return -1;
    }
    public int chengfang(int x){
        long res = 1;
        for (int i = 1; i <= x; i++) {
            res = (3*res)%1000000007;
        }
        return (int)(res%1000000007);
    }

    public static void main(String[] args) {
        System.out.println(new Solution().cuttingRope(127));
    }
}
