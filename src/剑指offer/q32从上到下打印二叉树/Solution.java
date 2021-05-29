package 剑指offer.q32从上到下打印二叉树;

import java.util.*;

public class Solution {
    public int[] levelOrder(TreeNode root) {
        //层序遍历
        if (root==null){
            return new int[0];
        }
        List<Integer> list = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()){
            TreeNode curr = queue.poll();
            list.add(curr.val);
            if (curr.left!=null){
                queue.offer(curr.left);
            }
            if (curr.right!=null){
                queue.offer(curr.right);
            }
        }
        int size = list.size();
        int[] res = new int[size];
        for (int i = 0; i < size; i++) {
            res[i] = list.get(i);
        }
        return res;
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(9);
        root.right = new TreeNode(20);
        root.right.left = new TreeNode(15);
        root.right.right = new TreeNode(7);
        System.out.println(new Solution().levelOrder(root));
    }
}
