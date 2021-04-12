package 字符串.Z自行变换;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public String convert(String s, int numRows) {
        if (s == null){return null;};
        if(numRows==1){return s;}
        List<StringBuilder> stringBuilders = new ArrayList<>();
        for (int i = 0; i < Math.min(s.length(),numRows); i++) {
            stringBuilders.add(new StringBuilder());
        }
        boolean goingDown =false;
        int row = 0;
        for (char c:
        s.toCharArray()){
            if(row==0||row==numRows-1){
                goingDown = !goingDown;
            }
            stringBuilders.get(row).append(c);
            row+=goingDown?1:-1;

        }
        StringBuilder res = new StringBuilder();
        for (StringBuilder ss:
             stringBuilders) {
            res.append(ss);
        }
        return res.toString();
    }

    public static void main(String[] args) {
        String s = "AB";
        Solution solution = new Solution();
        System.out.println(solution.convert(s,1));;
    }
}
