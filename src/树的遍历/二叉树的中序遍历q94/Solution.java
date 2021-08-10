package 树的遍历.二叉树的中序遍历q94;

import java.util.*;

public class Solution {
    private List<Integer> arrayList = new ArrayList<>();
    public List<Integer> inorderTraversal(TreeNode root) {
        if (root==null){
            return null;
        }
        inorderTraversal(root.left);
        arrayList.add(root.val);
        inorderTraversal(root.right);

        return arrayList;
    }
    public List<Integer> inorderTraversal1(TreeNode root){
        if (root==null){
            return arrayList;
        }
        Deque<TreeNode> stack = new LinkedList<>();
        TreeNode curr = root;
        while (curr!=null||!stack.isEmpty()){
            while (curr!=null){
                stack.push(curr);
                curr = curr.left;
            }
            TreeNode temp = stack.pop();
            arrayList.add(temp.val);
            if (temp.right!=null){
                curr = temp.right;
            }
        }
        return arrayList;
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.right = new TreeNode(2);
        root.left = new TreeNode(0);
        root.right.left = new TreeNode(3);
        System.out.println(new Solution().inorderTraversal1(root));
    }
}
