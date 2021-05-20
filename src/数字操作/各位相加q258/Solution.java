package 数字操作.各位相加q258;

public class Solution {
    public int addDigits(int num) {
        if(num<10){
            return num;
        }
        int ans = 0;
        int temp = 0;
        while (num!=0){
            temp = num%10;
            num = num/10;
            ans = ans+temp;
        }
        return addDigits(ans);
    }
    public int addDigits2(int num) {
        return (num - 1) % 9 + 1;
    }

    /**
     * 能够被9整除的整数，各位上的数字加起来也必然能被9整除，所以，连续累加起来，最终必然就是9。
     * 不能被9整除的整数，各位上的数字加起来，结果对9取模，和初始数对9取摸，是一样的，所以，连续累加起来，最终必然就是初始数对9取摸。
     * @param num
     * @return
     */
    int addDigits3(int num)
    {
        if(0 == num % 9)
        {
            return 9;
        }
        return num % 9;
    }

    public static void main(String[] args) {
        System.out.println(new Solution().addDigits(99));
    }
}
