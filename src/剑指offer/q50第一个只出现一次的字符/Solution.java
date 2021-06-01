package 剑指offer.q50第一个只出现一次的字符;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public char firstUniqChar(String s) {
        HashMap<Character, Boolean> dic = new HashMap<>();
        char[] sc = s.toCharArray();
        for(char c : sc)
            dic.put(c, !dic.containsKey(c));
        for(char c : sc)
            if(dic.get(c)) return c;
        return ' ';
    }

    public static void main(String[] args) {
        String s = "abaccdeff";
        System.out.println(new Solution().firstUniqChar(s));
    }

}
