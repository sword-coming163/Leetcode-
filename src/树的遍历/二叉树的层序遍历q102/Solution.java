package 树的遍历.二叉树的层序遍历q102;

import java.util.*;

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
    //层序遍历
    public List<List<Integer>> levelOrder1(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();

        Queue<TreeNode> queue = new LinkedList<>();
        if (root==null){
            return res;
        }
        queue.offer(root);
        while (!queue.isEmpty()){
            List<Integer> temp = new ArrayList<>();
            for (int i = queue.size(); i >0 ; i--) {
                TreeNode curr = queue.poll();
                temp.add(curr.val);
                if (curr.left!=null){
                    queue.offer(curr.left);
                }
                if (curr.right!=null){
                    queue.offer(curr.right);
                }
            }
            res.add(new ArrayList<>(temp));

        }
        return res;
    }
    public List<List<Integer>> levelOrder2(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();

        Queue<TreeNode> queue = new LinkedList<>();
        if (root==null){
            return res;
        }
        queue.offer(root);
        int level = 1;
        while (!queue.isEmpty()){
            LinkedList<Integer> temp = new LinkedList<>();
            for (int i = queue.size(); i >0 ; i--) {
                TreeNode curr = queue.poll();
                if (level%2==1){
                    //奇数层
                    temp.addLast(curr.val);
                }else {
                    temp.addFirst(curr.val);
                }

                if (curr.left!=null){
                    queue.offer(curr.left);
                }
                if (curr.right!=null){
                    queue.offer(curr.right);
                }
            }
            level++;
            res.add(new ArrayList<>(temp));

        }
//        for (int i = 0; i < res.size(); i++) {
//            if (i%2==1){
//                Collections.reverse(res.get(i));
//            }
//        }
        return res;
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(3);
        root.right = new TreeNode(20);
        root.left = new TreeNode(9);
        root.right.left = new TreeNode(15);
        root.right.right = new TreeNode(7);
        Solution solution = new Solution();
//        solution.preOrderTraverse(root);
        System.out.println(new Solution().levelOrder2(root));
    }
}
