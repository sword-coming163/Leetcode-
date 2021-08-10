package 企业常见题目.q003无重复字符的最长子串;

import java.util.HashMap;
import java.util.Map;

/**
 * @author zhang
 * @title: Solution
 * @projectName Leetcode-
 * @description: TODO
 * @date 2021/8/1:9:01
 */
public class Solution {
    /**
      * @param s
      * @description: 使用滑动窗口解决
      * @return {@link int}
      * @throws
      * @author zhang
      * @date 2021/8/1 9:01
     */
    public int lengthOfLongestSubstring(String s) {
        int left = 0;
        int right = 0;
        int res = 0;
        if (s==null||s.length()==0){
            return 0;
        }else if (s.length()==1){
            return 1;
        }
        Map<Character,Integer> map = new HashMap<>();
        for (right = 0; right < s.length(); right++) {
            if (map.containsKey(s.charAt(right))){
                left = Math.max(map.get(s.charAt(right))+1,left);
            }
            map.put(s.charAt(right),right);
            res = Math.max(res,right-left+1);
        }
        return res;
    }

    public static void main(String[] args) {
        String s = "abba";
        System.out.println(new Solution().lengthOfLongestSubstring(s));
    }

}
