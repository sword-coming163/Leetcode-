package 递归.二叉树的最大深度q104;

public class Solution {
    public int maxDepth(TreeNode root) {
        if (root==null) {
            return 0;
        }else {
            int heightLeft = maxDepth(root.left);
            int heightRight = maxDepth(root.right);
            return Math.max(heightLeft,heightRight)+1;
        }


    }
}
