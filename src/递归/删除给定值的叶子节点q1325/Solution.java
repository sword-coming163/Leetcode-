package 递归.删除给定值的叶子节点q1325;

public class Solution {
    //后序遍历+递归DFS
    public TreeNode removeLeafNodes(TreeNode root, int target) {
        if(root==null){
            return null;
        }
        TreeNode left = removeLeafNodes(root.left,target);
        TreeNode right = removeLeafNodes(root.right,target);
        root.left = left;
        root.right = right;
        if(left==null&&right==null&&root.val==target){
            return null;
        }

        return root;
    }

}
