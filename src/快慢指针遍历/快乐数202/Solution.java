package 快慢指针遍历.快乐数202;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Solution {


    public boolean isHappy1(int n) {
        int ans = 0;
        int temp = 0;
        while (n!=0){
            temp = n%10;
            n = n/10;
            ans = ans+temp*temp;
        }
        if (ans==1){
            return true;
        }
        if (ans == 145){
            return false;
        }
//        System.out.println(ans);
        return isHappy(ans);
    }
    private static Set<Integer> cycleMembers =
            new HashSet<>(Arrays.asList(4, 16, 37, 58, 89, 145, 42, 20));

    public int getNext(int n) {
        int totalSum = 0;
        while (n > 0) {
            int d = n % 10;
            n = n / 10;
            totalSum += d * d;
        }
        return totalSum;
    }


    public boolean isHappy(int n) {
        while (n != 1 && !cycleMembers.contains(n)) {
            n = getNext(n);
        }
        return n == 1;
    }

    public static void main(String[] args) {
        System.out.println(new Solution().isHappy(4));
    }
}
