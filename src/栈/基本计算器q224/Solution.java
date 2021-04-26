package 栈.基本计算器q224;

import java.util.Stack;

class Solution {
    public int calculate(String s) {
        int ans=0;
        char[] str=s.toCharArray();
        int len=str.length;
        Stack<Integer> st_num=new Stack<>();
        Stack<Integer> st_signs=new Stack<>();
        int sign=1;//正负号,运算符号
        for(int i=0;i<len;i++){
            if(str[i]==' ') continue;
            if(str[i]=='+'||str[i]=='-') sign=str[i]=='+'? 1:-1;
            else if(str[i]>='0'&&str[i]<='9'){//数字
                int num=str[i]-'0';
                while(i<len-1&&str[i+1]>='0'&&str[i+1]<='9'){//将这个数字找完
                    num=num*10+(str[++i]-'0');
                }
                ans+=sign*num;
            }else if(str[i]=='('){//左括号，暂存结果
                st_num.push(ans);
                st_signs.push(sign);
                ans=0;
                sign=1;
            }
            else ans=st_num.pop()+ans*st_signs.pop();//右括号更新结果
        }
        return ans;
    }

    public static void main(String[] args) {
        String s = "(1+(4+5+2)-3)+(6+8)";
        Solution solution = new Solution();

        System.out.println(solution.calculate(s));
    }
}
