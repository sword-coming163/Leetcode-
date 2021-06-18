package 剑指offer.q32从上到下打印二叉树.training;

import java.util.*;

public class Solution {
    public int[] levelOrder(TreeNode root) {
        if (root == null) {
            return new int[0];
        }
        //二叉树的层序遍历，使用一个辅助队列完成
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        List<Integer> list = new ArrayList<>();
        List<List> listList  = new ArrayList<>();
        while(!queue.isEmpty()){
            TreeNode temp = queue.poll();
            list.add(temp.val);
            if (temp.left!=null){
                queue.offer(temp.left);
            }
            if (temp.right!=null){
                queue.offer(temp.right);
            }
        }
        int[] res = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
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
        System.out.println(Arrays.toString(new Solution().levelOrder(root)));
    }
}
