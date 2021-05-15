package 二叉搜索树相关.验证二叉搜索树q98;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public boolean isValidBST(TreeNode root) {
        List<Integer> list = InOrderTraversal(root);
//        System.out.println(list);
        for (int i = 1; i < list.size(); i++) {
            if (list.get(i)<=list.get(i-1)){
                return false;
            }
        }
        return true;
    }
    //中序遍历
    public List<Integer> InOrderTraversal(TreeNode root){
        List<Integer> list = new ArrayList<>();
        InOrderTraversal(root,list);
        return list;
    }
    public void InOrderTraversal(TreeNode root,List<Integer> list){
        if (root==null){
            return;
        }
        InOrderTraversal(root.left,list);
        list.add(root.val);
        InOrderTraversal(root.right,list);
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(5);
        root.left = new TreeNode(1);
        root.right = new TreeNode(4);
        root.right.left = new TreeNode(3);
        root.right.right = new TreeNode(6);
        System.out.println(new Solution().isValidBST(root));
    }
    public boolean isValidBST1(TreeNode root) {
        return isValidBST1(root, Long.MIN_VALUE, Long.MAX_VALUE);
    }

    public boolean isValidBST1(TreeNode node, long lower, long upper) {
        if (node == null) {
            return true;
        }
        if (node.val <= lower || node.val >= upper) {
            return false;
        }
        return isValidBST1(node.left, lower, node.val) && isValidBST1(node.right, node.val, upper);
    }
}
