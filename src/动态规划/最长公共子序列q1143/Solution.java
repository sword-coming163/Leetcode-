package 动态规划.最长公共子序列q1143;

public class Solution {
    //暴力破解失败
    public int longestCommonSubsequence(String text1, String text2) {
        if(text1.isEmpty()||text2.isEmpty()){
            return 0;
        }
        char[] texts1 = text1.toCharArray();
        char[] texts2 = text2.toCharArray();
        int length = 0;
        int max = 0;

        for (int i = 0; i < text1.length(); i++) {
            int curr = i;
            for (int j = 0; j < texts2.length; j++) {
                if((curr<text1.length())&&(texts1[curr]==texts2[j])){
                    length++;
                    curr++;
                }

            }
            max = Math.max(max,length);
            length = 0;
        }
        for (int i = 0; i < text2.length(); i++) {
            int curr = i;
            for (int j = 0; j < texts1.length; j++) {
                if((curr<texts1.length)&&(texts2[curr]==texts1[j])){
                    length++;
                    curr++;
                }

            }
            max = Math.max(max,length);
            length = 0;
        }
        return max;
    }
    public int longestCommonSubsequence1(String text1, String text2) {
        int m = text1.length(), n = text2.length();
        int[][] dp = new int[m + 1][n + 1];
        for (int i = 1; i <= m; i++) {
            char c1 = text1.charAt(i - 1);
            for (int j = 1; j <= n; j++) {
                char c2 = text2.charAt(j - 1);
                if (c1 == c2) {
                    dp[i][j] = dp[i - 1][j - 1] + 1;
                } else {
                    dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);
                }
            }
        }
        return dp[m][n];
    }

    public static void main(String[] args) {
        String text1 = "ace";
        String text2 = "abcde";
        System.out.println(new Solution().longestCommonSubsequence1(text1,text2));
    }
}
