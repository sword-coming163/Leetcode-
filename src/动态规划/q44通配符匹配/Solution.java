package 动态规划.q44通配符匹配;

import org.junit.Test;

/**
 * @author zhang
 * @title: Solution
 * @projectName Leetcode-
 * @description: TODO
 * @date 2021/8/7:10:34
 */
public class Solution {
    /**
      * @param s
     * @param p
      * @description: 从后往前遍历
      * @return {@link boolean}
      * @throws
      * @author zhang
      * @date 2021/8/7 10:43
     */
    public boolean isMatch(String s, String p) {
        if (s==null||p==null){
            return false;
        }
        char[] charsS = s.toCharArray();
        char[] charsP = p.toCharArray();
        int i = charsS.length-1;
        int index = charsP.length-1;
        if (index>i){
            return false;
        }
        for (i = charsS.length-1,index = charsP.length-1;i >=0&&index>=0; i--,index--) {
            if (charsP[index]=='*'){
                return true;
            }else if (charsP[index]=='?'){
                continue;
            }else {
                if (charsP[index]!=charsS[i]){
                    return false;
                }
            }
        }
        if (i>=0||index>=0){
            return false;
        }
        return true;
    }
    public boolean isMatch1(String s, String p) {
        int m = s.length();
        int n = p.length();
        boolean[][] dp = new boolean[m + 1][n + 1];
        dp[0][0] = true;
        for (int i = 1; i <= n; ++i) {
            if (p.charAt(i - 1) == '*') {
                dp[0][i] = true;
            } else {
                break;
            }
        }
        for (int i = 1; i <= m; ++i) {
            for (int j = 1; j <= n; ++j) {
                if (p.charAt(j - 1) == '*') {
                    dp[i][j] = dp[i][j - 1] || dp[i - 1][j];
                } else if (p.charAt(j - 1) == '?' || s.charAt(i - 1) == p.charAt(j - 1)) {
                    dp[i][j] = dp[i - 1][j - 1];
                }
            }
        }
        return dp[m][n];
    }
    @Test
    public void test(){
        String s = "acdcb";
        String p = "a*c?b";
        System.out.println(isMatch(s,p));
    }
}
