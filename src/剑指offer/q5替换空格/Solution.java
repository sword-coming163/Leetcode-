package 剑指offer.q5替换空格;

public class Solution {
    public String replaceSpace(String s) {
        if (s.length()==0){
            return s;
        }
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i)==' '){
                stringBuilder.append("%20");
            }else {
                stringBuilder.append(s.charAt(i));
            }
        }
        return stringBuilder.toString();
    }

    public static void main(String[] args) {
        String s= "We are happy";
        System.out.println(new Solution().replaceSpace(s));
    }
}
