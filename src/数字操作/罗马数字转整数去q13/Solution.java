package 数字操作.罗马数字转整数去q13;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public int romanToInt(String s) {
        int temp = 0;
        int res = 0;
        if (s==null||s.length()==0){
            return 0;
        }
        Map<Character,Integer> hashMap = new HashMap<Character,Integer>();
        hashMap.put('M',1000);
        hashMap.put('D',500);
        hashMap.put('C',100);
        hashMap.put('L',50);
        hashMap.put('X',10);
        hashMap.put('V',5);
        hashMap.put('I',1);
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i)=='I'&&i<s.length()-1&&s.charAt(i+1)=='V'){
                temp = 4;
                i++;
            }
             else if (s.charAt(i)=='I'&&i<s.length()-1&&s.charAt(i+1)=='X'){
                temp = 9;
                i++;
            }
            else if (s.charAt(i)=='X'&&i<s.length()-1&&s.charAt(i+1)=='L'){
                temp = 40;
                i++;
            }
            else if (s.charAt(i)=='X'&&i<s.length()-1&&s.charAt(i+1)=='C'){
                temp = 90;
                i++;
            }
            else if (s.charAt(i)=='C'&&i<s.length()-1&&s.charAt(i+1)=='D'){
                temp = 400;
                i++;
            }
            else if (s.charAt(i)=='C'&&i<s.length()-1&&s.charAt(i+1)=='M'){
                temp = 900;
                i++;
            }else {
                temp = hashMap.get(s.charAt(i));
            }
            res = res + temp;

        }
        return res;

    }

    public static void main(String[] args) {
        System.out.println(new Solution().romanToInt("IV"));
    }
}
