//package 笔试.vivo.q3;
//
//import java.util.*;
//
//public class Main {
//    public int countArea(int[] A, int n) {
//        int max = 0;
//        for (int i = 0; i < n-1; i++) {
//            for (int j = i+1; j < n; j++) {
//                max = Math.max(max,(Math.min(A[j],A[i])*(j-i+1)));
//            }
//
//        }
//        return max;
//    }
//
//    public static void main(String[] args) {
//        int[] nums = new int[]{2,7,9,4,1};
//        String s = "(){}[]";
//        System.out.println(new Main().isValid(s));
//    }
//    public int FindGreatestSumOfSubArray(int[] array) {
//        int[] dp = new int[array.length+1];
//        dp[0] = 0;
//        int maxSum = Integer.MIN_VALUE;
//        for (int i = 0; i < array.length; i++) {
//            dp[i+1] = Math.max(array[i],dp[i]+array[i]);
//            maxSum = Math.max(dp[i+1],maxSum);
//
//        }
//        return maxSum;
//    }
//    public boolean isValid (String s) {
//        if (s==null||s.length()==0){
//            return true;
//        }
//        Deque<Character> stack = new LinkedList<>();
//        for(char ch: s.toCharArray()){
//           if (ch=='('||ch=='['||ch=='{'){
//               stack.push(ch);
//           }else {
//               if (stack.isEmpty()){
//                   return false;
//               }else {
//                   char temp = stack.pop();
//                   if (ch==')'){
//                       if (temp!='('){
//                           return false;
//                       }
//                   }
//                   if (ch==']'){
//                       if (temp!='['){
//                           return false;
//                       }
//                   }
//                   if (ch=='}'){
//                       if (temp!='{'){
//                           return false;
//                       }
//                   }
//               }
//
//           }
//        }
//        return stack.isEmpty()?true:false;
//    }
////    public int minCoins (int V, int[] coins, int M) {
////        // write code here
////    }
////    int[] coins, int amount
//    public int minCoins(int V, int[] coins, int M) {
//        if (V < 1) {
//            return 0;
//        }
//        return coinChange(coins, V, new int[V]);
//    }
//
//    private int coinChange(int[] coins, int rem, int[] count) {
//        if (rem < 0) {
//            return -1;
//        }
//        if (rem == 0) {
//            return 0;
//        }
//        if (count[rem - 1] != 0) {
//            return count[rem - 1];
//        }
//        int min = Integer.MAX_VALUE;
//        for (int coin : coins) {
//            int res = coinChange(coins, rem - coin, count);
//            if (res >= 0 && res < min) {
//                min = 1 + res;
//            }
//        }
//        count[rem - 1] = (min == Integer.MAX_VALUE) ? -1 : min;
//        return count[rem - 1];
//    }
//    ArrayList<String> ans;
//    HashMap<Integer, char[]> map;
//    StringBuilder res;
//    int len;
//
//    public ArrayList<String> letterCombinations(String digits) {
//        ans = new ArrayList<>();
//        len = digits.length();
//        if (len < 1) return new ArrayList<>();
//        char[] nums = digits.toCharArray();
//        res = new StringBuilder();
//        map = new HashMap<>();
//        map.put(2, new char[]{'a', 'b', 'c'});
//        map.put(3, new char[]{'d', 'e', 'f'});
//        map.put(4, new char[]{'g', 'h', 'i'});
//        map.put(5, new char[]{'j', 'k', 'l'});
//        map.put(6, new char[]{'m', 'n', 'o'});
//        map.put(7, new char[]{'p', 'q', 'r', 's'});
//        map.put(8, new char[]{'t', 'u', 'v'});
//        map.put(9, new char[]{'w', 'x', 'y', 'z'});
//        dfs(nums, 0);
//        return ans;
//    }
//
//    public void dfs(char[] nums, int startIndex) {
//        if (res.length() >= len) {
//            ans.add(new String(res));
//            return;
//        }
//        char[] chars = map.get(nums[startIndex] - '0');
//        for (int i = 0; i < chars.length; i++) {
//            res.append(chars[i]);
//            dfs(nums, startIndex + 1);
//            res.delete(res.length() - 1, res.length());
//        }
//    }
//    public int countArea(int[] A, int n) {
//        int res = 0;
//        Deque<Integer> stack = new ArrayDeque<>();
//        int[] new_heights = new int[A.length + 2];
//        for (int i = 1; i < A.length + 1; i++) new_heights[i] = A[i - 1];
//
//        for (int i = 0; i < new_heights.length; i++) {
//            while (!stack.isEmpty() && new_heights[stack.peek()] > new_heights[i]) {
//                int cur = stack.pop();
//                res = Math.max(res, (i - stack.peek() - 1) * new_heights[cur]);
//            }
//            stack.push(i);
//        }
//        return res;
//    }
//    //设置全局列表存储最后的结果
//    List<String> list = new ArrayList<>();
//
//    public List<String> letterCombinations(String digits) {
//        if (digits == null || digits.length() == 0) {
//            return list;
//        }
//        //初始对应所有的数字，为了直接对应2-9，新增了两个无效的字符串""
//        String[] numString = {"", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
//        //迭代处理
//        backTracking(digits, numString, 0);
//        return list;
//
//    }
//
//    //每次迭代获取一个字符串，所以会设计大量的字符串拼接，所以这里选择更为高效的 StringBuild
//    StringBuilder temp = new StringBuilder();
//
//    //比如digits如果为"23",num 为0，则str表示2对应的 abc
//    public void backTracking(String digits, String[] numString, int num) {
//        //遍历全部一次记录一次得到的字符串
//        if (num == digits.length()) {
//            list.add(temp.toString());
//            return;
//        }
//        //str 表示当前num对应的字符串
//        String str = numString[digits.charAt(num) - '0'];
//        for (int i = 0; i < str.length(); i++) {
//            temp.append(str.charAt(i));
//            //c
//            backTracking(digits, numString, num + 1);
//            //剔除末尾的继续尝试
//            temp.deleteCharAt(temp.length() - 1);
//        }
//    }
//}
//
