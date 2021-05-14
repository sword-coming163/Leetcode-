package 树的遍历.二叉树的层序遍历q102;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Solution {
    //层序遍历
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> list = new ArrayList<List<Integer>>();
        Queue<TreeNode> queue = new LinkedList<>();
        if(root==null){
            return list;
        }
        queue.add(root);
        int level = 0;
        while (!queue.isEmpty()){
            List<Integer> arrayList = new ArrayList<>();
            level = queue.size();
            for (int i = 0; i < level; i++) {
                TreeNode node = queue.poll();
                arrayList.add(node.val);
                if (node.left!=null){
                    queue.add(node.left);
                }
                if(node.right!=null){
                    queue.add(node.right);
                }
            }
            list.add(arrayList);
        }
        return list;
    }
    //前序遍历
    public void preOrderTraverse(TreeNode node){
        if (node==null){
            return;
        }
        System.out.println(node.val);
        preOrderTraverse(node.left);
        preOrderTraverse(node.right);
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.right = new TreeNode(2);
        root.left = new TreeNode(0);
        root.right.left = new TreeNode(3);
        Solution solution = new Solution();
        solution.preOrderTraverse(root);
        System.out.println(solution.levelOrder(root));
    }
}
