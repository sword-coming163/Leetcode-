package 企业常见题目.q415字符串相加;

import com.sun.deploy.util.StringUtils;

/**
 * @author zhang
 * @title: Solution
 * @projectName Leetcode-
 * @description: TODO
 * @date 2021/7/31:11:19
 */
public class Solution {
    public String addStrings(String num1, String num2) {
        if (num1==null||num1.length()==0){
            return num2;
        }else if (num2==null||num2.length()==0){
            return num1;
        }
        StringBuilder stringBuilder = new StringBuilder();
        StringBuilder string1 = new StringBuilder();
        StringBuilder string2 = new StringBuilder();
        if (num1.length()<num2.length()){
            for (int i = 0; i < num2.length()-num1.length(); i++) {
                string1.append(0);
            }
        }else if (num1.length()>num2.length()){
            for (int i = 0; i < num1.length()-num2.length(); i++) {
                string2.append(0);
            }
        }
        string1.append(num1);
        string2.append(num2);
        int index = string1.length()-1;
        int carry = 0;
        while (index>=0){
            int a = string1.charAt(index)-48;
            int b = string2.charAt(index)-48;
            if (a+b+carry>=10){
                stringBuilder.append((a+b+carry)%10);
                carry = 1;
            }else {
                stringBuilder.append(a+b+carry);
                carry = 0;
            }
            index--;
        }
        if (carry==1){
            stringBuilder.append(1);
        }
        //做字符串相加减
        return stringBuilder.reverse().toString();

    }
    public String addStrings1(String num1, String num2) {
        int i = num1.length() - 1, j = num2.length() - 1, add = 0;
        StringBuffer ans = new StringBuffer();
        while (i >= 0 || j >= 0 || add != 0) {
            int x = i >= 0 ? num1.charAt(i) - '0' : 0;
            int y = j >= 0 ? num2.charAt(j) - '0' : 0;
            int result = x + y + add;
            ans.append(result % 10);
            add = result / 10;
            i--;
            j--;
        }
        // 计算完以后的答案需要翻转过来
        ans.reverse();
        return ans.toString();
    }

    public static void main(String[] args) {
        System.out.println(new Solution().addStrings("1","9"));
    }
}
