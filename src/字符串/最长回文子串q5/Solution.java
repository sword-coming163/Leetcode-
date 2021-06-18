package 字符串.最长回文子串q5;

public class Solution {
    public String longestPalindrome(String s) {
        if (s.length()<2){
            return s;
        }
        boolean[][] dp = new boolean[s.length()][s.length()];
        int begin = 0;
        int max = 1;
        //初始化dp数组
        for (int i = 0; i < s.length(); i++) {
            dp[i][i] = true;
        }
        //按照长度大小进行动态规划判断
        for (int L = 2; L <= s.length(); L++) {
            for (int i = 0; i < s.length(); i++) {
                // j-i +1 =L
                int j = L+i-1;
                if (j>=s.length()){break;}
                if (s.charAt(i)!=s.charAt(j)){
                    dp[i][j] = false;
                }else {
                    if (j-i<=2){
                        dp[i][j] = true;
                    }else {
                        dp[i][j] = dp[i+1][j-1];
                    }
                }
                if (dp[i][j]&&(j-i+1>max)){
                    begin = i;
                    max = j-i+1;
                }
            }
        }
        return s.substring(begin,begin+max);
    }

    public static void main(String[] args) {
        String s = "bb";
        System.out.println(new Solution().longestPalindrome(s));
    }
}
