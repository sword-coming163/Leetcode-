package 剑指offer.q27二叉树的镜像;

public class Solution {
    public TreeNode mirrorTree(TreeNode root) {
        //使用前序遍历+递归
        if (root==null){return root;}
        TreeNode temp = root.left;
        root.left = root.right;
        root.right = temp;
        mirrorTree(root.left);
        mirrorTree(root.right);
        return root;

    }
    //使用后序遍历+递归
    public TreeNode mirrorTree1(TreeNode root){
        if (root==null){
            return null;
        }
        TreeNode left = mirrorTree(root.left);
        TreeNode right = mirrorTree(root.right);
        root.left = right;
        root.right = left;
        return root;
    }
}
