package 剑指offer.q48最长不含重复字符的子字符串;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Solution {
    public int lengthOfLongestSubstring(String s) {
        Map<Character, Integer> dic = new HashMap<>();
        int res = 0, tmp = 0;
        for(int j = 0; j < s.length(); j++) {
            int i = dic.getOrDefault(s.charAt(j), -1); // 获取索引 i
            dic.put(s.charAt(j), j); // 更新哈希表
            tmp = tmp < j - i ? tmp + 1 : j - i; // dp[j - 1] -> dp[j]
            res = Math.max(res, tmp); // max(dp[j - 1], dp[j])
        }
        return res;
    }
    //双指针+哈希表
    public int lengthOfLongestSubstring1(String s) {
        Map<Character, Integer> dic = new HashMap<>();
        int i = -1, res = 0;
        for(int j = 0; j < s.length(); j++) {
            if(dic.containsKey(s.charAt(j)))
                i = Math.max(i, dic.get(s.charAt(j))); // 更新左指针 i

            dic.put(s.charAt(j), j); // 哈希表记录
            res = Math.max(res, j - i); // 更新结果
        }
        return res;
    }
    //滑动窗口
    public int lengthOfLongestSubstring2(String s) {
        if (s.length() < 1) return 0;
        Set<Character> rec = new HashSet<>();//记录是否出现重复元素
        int ans = 1, n = s.length();
        for (int i = 0, j = 0; i < n; i++) {//i为左边界，j为右边界
            while (j < n && !rec.contains(s.charAt(j))) {
                rec.add(s.charAt(j++));//右边扩张，直到[i-j]范围内出现了重复元素
            }
            rec.remove(s.charAt(i));//收缩左边界，从集合中移除出界的字符
            ans = Math.max(j - i, ans);//更新最大区间
        }
        return ans;
    }
}
