package 树的遍历.二叉树的后序遍历;

import java.util.*;

public class Solution {
    private List<Integer> list = new ArrayList<>();
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
    public List<Integer> postorderTraversal1(TreeNode root) {
        if (root==null){
            return list;
        }
        Deque<TreeNode> stack1 = new LinkedList<>();
        Deque<TreeNode> stack2 = new LinkedList<>();
        stack1.push(root);
        while (!stack1.isEmpty()){
            TreeNode node = stack1.pop();
            stack2.push(node);
            if (node.left!=null){
                stack1.push(node.left);
            }
            if (node.right!=null){
                stack1.push(node.right);
            }
        }
        while (!stack2.isEmpty()){
            list.add(stack2.pop().val);
        }
        return list;
    }
    public static void postOrderIteration2(TreeNode head) {
        if (head == null) {
            return;
        }
        TreeNode cur = head;
        Stack<TreeNode> stack = new Stack<>();
        stack.push(head);
        while (!stack.isEmpty()) {
            TreeNode peek = stack.peek();
            if (peek.left != null && peek.left != cur && peek.right != cur) {
                stack.push(peek.left);
            } else if (peek.right != null && peek.right != cur) {
                stack.push(peek.right);
            } else {
                System.out.print(stack.pop().val + " ");
                cur = peek;
            }
        }
    }


    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(0);
        root.right = new TreeNode(2);
        root.right.left = new TreeNode(3);
        System.out.println(new Solution().postorderTraversal(root));
    }
}
