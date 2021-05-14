package 树的遍历.二叉树的中序遍历q94;

import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

public class Solution {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> arrayList = new ArrayList<>();
        if (root!=null){
            arrayList.addAll(inorderTraversal(root.left));
            arrayList.add(root.val);
            arrayList.addAll(inorderTraversal(root.right));
        }
        return arrayList;

    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.right = new TreeNode(2);
        root.left = new TreeNode(0);
        root.right.left = new TreeNode(3);
        System.out.println(new Solution().inorderTraversal(root));
    }
}
