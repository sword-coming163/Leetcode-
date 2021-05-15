package 二叉搜索树相关.二叉搜索树的插入操作q701;

public class Solution {
    public TreeNode insertIntoBST(TreeNode root, int val) {
        if(root==null){
            root = new TreeNode(val);
        }
        if(root.val>val){
            if(root.left==null){
                root.left = new TreeNode(val);
                return root;
            }else {
                insertIntoBST(root.left,val);
            }

        }
        if(root.val<val){
            if(root.right==null){
                root.right = new TreeNode(val);
                return root;
            }else {
                insertIntoBST(root.right,val);
            }

        }
        return root;
    }
}
