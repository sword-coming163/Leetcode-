package 剑指offer.q58左旋转字符串;

public class Solution {
    public String reverseLeftWords(String s, int n) {
        if (s==null){
            return s;
        }
        //使用现有的字符串处理方式
        StringBuilder stringBuilder = new StringBuilder(s.substring(0,n));
        StringBuilder stringBuilder1 = new StringBuilder(s.substring(n,s.length()));
        return stringBuilder1.append(stringBuilder).toString();
    }
    //直接遍历
    public String reverseLeftWords1(String s,int n){
        if (s==null){
            return s;
        }
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = n; i <s.length() ; i++) {
            stringBuilder.append(s.charAt(i));
        }
        for (int i = 0; i < n; i++) {
            stringBuilder.append(s.charAt(i));
        }
        return stringBuilder.toString();
    }


    public static void main(String[] args) {
        String s = "abcdefg";
        System.out.println(new Solution().reverseLeftWords1(s,2));
    }
}
