package 栈.最长有效括号q32;

import java.util.Stack;

public class Solution {
    //使用动态规划解决
    public int longestValidParentheses(String s) {
        if(s.length()<2){return 0;}
        int maxLength = 0;
        int[] dp = new int[s.length()];
        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i)==')'){
                if (s.charAt(i-1)=='('){
                    dp[i] = (i>=2?dp[i-2]:0)+2;
                }else if ((i-dp[i-1])>0 && s.charAt(i-dp[i-1]-1)=='('){
                    dp[i] = dp[i-1]+((i-dp[i-1])>=2?dp[i-dp[i-1]-2]:0)+2;
                }
            maxLength = Math.max(maxLength,dp[i]);
            }

        }
        return maxLength;
    }

    //使用栈来解决问题
    public int longestValidParentheses1(String s){
        int maxLength = 0;
        Stack<Integer> stack = new Stack<>();
        stack.push(-1);
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i)=='('){
                //如果为左括号入栈
                stack.push(i);
            }else {
                //如果为有括号，出栈
                stack.pop();
                if (stack.empty()){
                    stack.push(i);
                }else{
                    maxLength = Math.max(maxLength,i-stack.peek());
                }
            }
        }
        return maxLength;
    }

    public static void main(String[] args) {
        String s =")()())";
        Solution solution = new Solution();
        System.out.println(solution.longestValidParentheses1(s));
    }
}
