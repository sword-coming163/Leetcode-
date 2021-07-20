package 字符串.q125验证回文串;

import java.util.Arrays;
import java.util.Collections;
import java.util.Locale;

/**
 * @author zhang
 * @title: Solution
 * @projectName Leetcode-
 * @description: TODO
 * @date 2021/7/18:15:41
 */
public class Solution {
    public boolean isPalindrome(String s) {
        if (s==null||s.length()==0){
            return true;
        }
        s= s.toLowerCase();
        System.out.println(s);
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i)>='a'&&s.charAt(i)<='z'){
                stringBuilder.append(s.charAt(i));
            }else if (s.charAt(i)>='0'&&s.charAt(i)<='9'){
                stringBuilder.append(s.charAt(i));

            }
        }
        int left = 0;
        int right = stringBuilder.length()-1;
        System.out.println(stringBuilder.toString());
        while (left<right){
            if (stringBuilder.charAt(left)!=stringBuilder.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    public static void main(String[] args) {
        String s = "9.8";
        System.out.println(new Solution().isPalindrome(s));
    }

}
