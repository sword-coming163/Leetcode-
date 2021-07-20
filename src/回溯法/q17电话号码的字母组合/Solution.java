package 回溯法.q17电话号码的字母组合;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author zhang
 * @title: Solution
 * @projectName Leetcode-
 * @description: TODO
 * @date 2021/7/19:11:11
 */
public class Solution {
    Map<Character,Character[]> map;
    StringBuilder stringBuilder;
    List<String> res;
    public Solution() {
        stringBuilder = new StringBuilder();
        map = new HashMap<>();
        res = new ArrayList<>();
        map.put('2',new Character[]{'a','b','c'});
        map.put('3',new Character[]{'d','e','f'});
        map.put('4',new Character[]{'g','h','l'});
        map.put('5',new Character[]{'j','k','l'});
        map.put('6',new Character[]{'m','n','o'});
        map.put('7',new Character[]{'p','q','r','s'});
        map.put('8',new Character[]{'t','u','v'});
        map.put('9',new Character[]{'w','x','y','z'});
    }



    public List<String> letterCombinations(String digits) {
        if (digits==null||digits.length()==0){
            return res;
        }
        dfs(0,digits);
        return res;
    }
    public void dfs(int index,String s){
        if (index == s.length()){
            res.add(stringBuilder.toString());
            return;
        }
        if (s.charAt(index)=='1'){
            return;
        }
        Character[] temp = map.get(s.charAt(index));
        for (int i = 0; i < temp.length; i++) {
            stringBuilder.append(temp[i]);
            dfs(index+1,s);
            stringBuilder.deleteCharAt(stringBuilder.length()-1);
        }
    }

    public static void main(String[] args) {
        String s = "23";
        System.out.println(new Solution().letterCombinations(s));
    }
}
