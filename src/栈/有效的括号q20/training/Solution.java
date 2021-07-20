package 栈.有效的括号q20.training;

import java.util.Deque;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

/**
 *
 * @author zhang
 * @title: Solution
 * @projectName Leetcode-
 * @description: TODO
 * @date 2021/7/19:21:51
 */
public class Solution {
    public boolean isValid(String s) {
        if (s==null||s.length()==0){
            return true;
        }
        Map<Character,Character> map = new HashMap<Character,Character>(3){{
            put(')','(');
            put('}','{');
            put(']','[');
        }};
        int n = s.length();
        Deque<Character> stack = new LinkedList<>();
        for (int i = 0; i < n; i++) {
            if(s.charAt(i)=='('||s.charAt(i)=='['||s.charAt(i)=='{'){
                stack.push(s.charAt(i));
            }else {
                if (stack.isEmpty()){
                    return false;
                }else {
                    Character character = stack.pop();
                    if (!character.equals(map.get(s.charAt(i)))){
                        return false;
                    }
                }
            }
        }
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        String s = "()[]{}";
        System.out.println(new Solution().isValid(s));
    }
}
