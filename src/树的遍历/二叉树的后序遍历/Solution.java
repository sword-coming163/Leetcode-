package 树的遍历.二叉树的后序遍历;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        postorder(root,list);
        return list;
    }
    public void postorder(TreeNode node,List<Integer> list){
        if (node==null){return;}
        postorder(node.left,list);
        postorder(node.right,list);
        list.add(node.val);
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(0);
        root.right = new TreeNode(2);
        root.right.left = new TreeNode(3);
        System.out.println(new Solution().postorderTraversal(root));
    }
}
