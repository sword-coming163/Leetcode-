package 剑指offer.q43前N个整数中1出现的次数;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public int countDigitOne1(int n) {
        // 创建一个hashmap进行记忆化存储，对数进行求余，无法利用有序性
        int count = 1;
        Map<Integer,Integer> hashmap = new HashMap<>();
        if (n<10){return 1;};
        hashmap.put(1,1);
        int curr = 10;
        int temp = 1;
        while (curr<=n){
            //取个位
            temp = curr%10;
            if (hashmap.containsKey(curr/10)){
                count = count+hashmap.get(curr/10);
            }
            if(temp==1){
                count++;
                hashmap.put(curr,hashmap.getOrDefault(curr/10,0)+1);
                hashmap.remove(curr/100);
            }else {
                hashmap.put(curr,hashmap.getOrDefault(curr/10,0));
                hashmap.remove(curr/100);

            }
            curr++;

        }
        System.out.println(hashmap.size());
        return count;
    }
    public int countDigitOne(int n) {
        int digit = 1, res = 0;
        int high = n / 10, cur = n % 10, low = 0;
        while(high != 0 || cur != 0) {
            if(cur == 0) res += high * digit;
            else if(cur == 1) res += high * digit + low + 1;
            else res += (high + 1) * digit;
            low += cur * digit;
            cur = high % 10;
            high /= 10;
            digit *= 10;
        }
        return res;
    }



    public static void main(String[] args) {
        System.out.println(new Solution().countDigitOne(11111111));
    }
}
