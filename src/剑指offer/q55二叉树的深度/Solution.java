package 剑指offer.q55二叉树的深度;

public class Solution {
    public int maxDepth(TreeNode root) {
        //后序遍历+递归
        if (root==null){
            return 0;
        }
        return getHeight(root);
    }
    public int getHeight(TreeNode root){
        if (root==null){
            return 0;
        }
        return Math.max(getHeight(root.left),getHeight(root.right))+1;
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(9);
        root.right = new TreeNode(20);
        root.right.left = new TreeNode(15);
        root.right.right = new TreeNode(7);
        System.out.println(new Solution().getHeight(root));
    }
}
