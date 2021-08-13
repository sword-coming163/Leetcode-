package 企业常见题目.q199二叉树的右视图;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * @author zhang
 * @title: Solution
 * @projectName Leetcode-
 * @description: 使用层序遍历
 * @date 2021/8/10 21:31
 */
public class Solution {
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();
        if (root==null){
            return res;
        }
        queue.add(root);
        while (!queue.isEmpty()){
            TreeNode temp = null;
            for (int i = queue.size(); i >0 ; i--) {
                temp = queue.poll();
                if (temp.left!=null){
                    queue.offer(temp.left);
                }
                if (temp.right!=null){
                    queue.offer(temp.right);
                }
            }
            res.add(temp.val);
        }
        return res;
    }
}
