package 剑指offer.q33二叉搜索树的后序遍历序列;

import java.util.Stack;

public class Solution {
//    public boolean verifyPostorder(int[] postorder) {
//        return recur(postorder, 0, postorder.length - 1);
//    }
//    boolean recur(int[] postorder, int i, int j) {
//        if(i >= j) return true;
//        int p = i;
//        while(postorder[p] < postorder[j]) p++;
//        int m = p;
//        while(postorder[p] > postorder[j]) p++;
//        return p == j && recur(postorder, i, m - 1) && recur(postorder, m, j - 1);
//    }
    public boolean verifyPostorder1(int[] postorder) {
        Stack<Integer> stack = new Stack<>();
        int root = Integer.MAX_VALUE;
        for(int i = postorder.length - 1; i >= 0; i--) {
            if(postorder[i] > root) return false;
            while(!stack.isEmpty() && stack.peek() > postorder[i])
                root = stack.pop();
            stack.add(postorder[i]);
        }
        return true;
    }
    public boolean verifyPostorder(int[] postorder) {
        if(postorder==null||postorder.length==0){
            return false;
        }
        //使用分治+递归完成
        return recur(postorder,0,postorder.length-1);
    }
    public boolean recur(int[] postorder,int i,int j){
        if(i>=j){return true;}
        int p = i;
        while(postorder[p]<postorder[j]){p++;};
        int m =p; //保存左右子树的分界点，左子树的在数组中的最后一个节点
        while(postorder[p]>postorder[j]){p++;};
        return (p==j)&&(recur(postorder,i,m-1))&&(recur(postorder,m,j-1));
    }

    public static void main(String[] args) {
        int[] nums = new int[]{4,8,6,12,16,14,10};
        System.out.println(new Solution().verifyPostorder(nums));
    }
}
