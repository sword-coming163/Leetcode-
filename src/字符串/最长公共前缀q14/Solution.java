package 字符串.最长公共前缀q14;

public class Solution {
    public String longestCommonPrefix(String[] strs) {
        int index=0;
        StringBuilder stringBuilder = new StringBuilder();
        if(strs.length==0){
            return stringBuilder.toString();
        }
        int length = strs.length;

        while (true){
            if (strs[0].length() == index) {
                return stringBuilder.toString();
            }
            for (int i = 1; i < length; i++) {
                char temp = strs[0].charAt(index);
                if(strs[i].length()==index||temp!=strs[i].charAt(index)){
                    return stringBuilder.toString();
                }


            }
            stringBuilder.append(strs[0].charAt(index));
//            System.out.println(stringBuilder.toString());
            index++;

        }
    }

    public static void main(String[] args) {
        String[] strings= new String[]{"flower","flow","flight"};
        Solution solution = new Solution();
        System.out.printf(solution.longestCommonPrefix(strings));
    }
}
