package 剑指offer.q26树的子结构;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public boolean isSubStructure(TreeNode A, TreeNode B) {
        return (A != null && B != null) && (recur(A, B) || isSubStructure(A.left, B) || isSubStructure(A.right, B));
    }
    boolean recur(TreeNode A, TreeNode B) {
        if(B == null) return true;
        if(A == null || A.val != B.val) return false;
        return recur(A.left, B.left) && recur(A.right, B.right);
    }
    //树的中序遍历
    private List<Integer> inOrderTraverse(TreeNode root){
        List<Integer> list  = new ArrayList<>();
        inOrder(root,list);
        return list;

    }
    private void inOrder(TreeNode root,List<Integer> list){
        if (root==null){
            return;
        }
        inOrder(root.left,list);
        list.add(root.val);
        inOrder(root.right,list);
    }

    public static void main(String[] args) {
        TreeNode root1 = new TreeNode(3);
        root1.left = new TreeNode(4);
        root1.left.left = new TreeNode(1);
        root1.left.right = new TreeNode(2);
        root1.right = new TreeNode(5);
        TreeNode root2 = new TreeNode(4);
        root2.left = new TreeNode(1);
        System.out.println(new Solution().isSubStructure(root1,root2));
    }

}
