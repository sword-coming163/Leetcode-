package 剑指offer.q5替换空格.training;

public class Solution {
    //时间复杂度O(N) 空间复杂度O(N)
    public String replaceSpace(String s) {
        //遍历字符串，并把字符串存储到StringBuild中
        StringBuilder StringBuilder = new StringBuilder();
        for(int i =0;i<s.length();i++){
            if(s.charAt(i)==' '){
                StringBuilder.append("%20");
            }else{
                StringBuilder.append(s.charAt(i));
            }

        }
        return StringBuilder.toString();
    }
}
