package 动态规划.最长回文子串q5.training;

public class Solution {
    public String longestPalindrome(String s) {
        //使用动态规划来解决
        if(s==null||s.length()==1){
            return s;
        }

        int begin = 0;
        int max = 1;
        int length = s.length();
        boolean[][] dp = new boolean[length][length];
        //初始化
        for (int i = 0; i < length; i++) {
            dp[i][i] = true;
        }
        for (int L = 2; L <= length; L++) {
            for (int i = 0; i < s.length(); i++) {
                //左边坐标为i,则根据长度可以计算出右边坐标为L = j-i+1;那么j = L+i-1
                int j = L+i-1;
                if(j>=length){
                    break;
                }
                if(s.charAt(i)!=s.charAt(j)){
                    dp[i][j] = false;
                }else {
                    if (j-i<2){
                        dp[i][j] = true;
                    }else {
                        dp[i][j] = dp[i+1][j-1];
                    }
                }
                if (dp[i][j]&&j-i+1>max){
                    max = j-i+1;
                    begin = i;
                }
            }
        }
        return s.substring(begin,begin+max);
    }

    public static void main(String[] args) {
        String s = "bababd";
        System.out.println(new Solution().longestPalindrome(s));
    }
}
