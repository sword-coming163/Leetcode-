package 数字操作.回文数q9;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {
    public boolean isPalindrome1(int x) {
        //把数字转化为数组
        List<Integer> list = new ArrayList<>();
        int temp = 0;

        if(x<0){
            return false;
        }
        if (x==0){
            return true;
        }
        while (x!=0){
            temp = x%10;
            list.add(temp);
            x = x/10;
        }
        for (int i = 0; i <= list.size()/2; i++) {
            if (list.get(i)==list.get(list.size()-1-i)){
                continue;
            }else {
                return false;
            }
        }
        return true;
    }
    public boolean isPalindrome(int x) {
        // 特殊情况：
        // 如上所述，当 x < 0 时，x 不是回文数。
        // 同样地，如果数字的最后一位是 0，为了使该数字为回文，
        // 则其第一位数字也应该是 0
        // 只有 0 满足这一属性
        if (x < 0 || (x % 10 == 0 && x != 0)) {
            return false;
        }

        int revertedNumber = 0;
        while (x > revertedNumber) {
            revertedNumber = revertedNumber * 10 + x % 10;
            x /= 10;
        }

        // 当数字长度为奇数时，我们可以通过 revertedNumber/10 去除处于中位的数字。
        // 例如，当输入为 12321 时，在 while 循环的末尾我们可以得到 x = 12，revertedNumber = 123，
        // 由于处于中位的数字不影响回文（它总是与自己相等），所以我们可以简单地将其去除。
        return x == revertedNumber || x == revertedNumber / 10;
    }

    public static void main(String[] args) {
        System.out.println(new Solution().isPalindrome(1001));
    }
}
