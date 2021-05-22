package 双指针遍历.无重复字符的最长子串q3;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class Solution {
    public int lengthOfLongestSubstring(String s) {
        int count = 1;
        int max = 0;
        Set<Character> set = new HashSet<>();
        for (int i = 0; i < s.length(); i++) {
            set.clear();
            count = 1;
            set.add(s.charAt(i));
            for (int j = i+1; j < s.length(); j++) {
                if (set.add(s.charAt(j))){
                    count++;
                }else {
                    break;
                }
            }
            max = Math.max(max,count);
        }
        return max;
    }
    public int lengthOfLongestSubstring1(String s) {
        if (s.length()==0) return 0;
        HashMap<Character, Integer> map = new HashMap<Character, Integer>();
        int max = 0;
        int left = 0;
        for(int i = 0; i < s.length(); i ++){
            if(map.containsKey(s.charAt(i))){
                left = Math.max(left,map.get(s.charAt(i)) + 1);
            }
            map.put(s.charAt(i),i);
            max = Math.max(max,i-left+1);
        }
        return max;

    }

    public static void main(String[] args) {
        System.out.println(new Solution().lengthOfLongestSubstring("abcbcb"));
    }
}
