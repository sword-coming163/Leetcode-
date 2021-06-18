package 剑指offer.q34二叉树中和为某一值的路径.training;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Solution {
    LinkedList<Integer> path = new LinkedList<>();
    List<List<Integer>> res = new ArrayList<>();
    public List<List<Integer>> pathSum(TreeNode root, int target) {
        //dfs+前序遍历
        helper(root,target);
        return res;


    }
    public void helper(TreeNode root, int target){
        if (root==null){
            return;
        }
        path.add(root.val);
        target = target-root.val;
        if (target==0&&root.left==null&&root.right==null){
            res.add(new LinkedList<>(path));
        }
        helper(root.left,target);
        helper(root.right,target);
        path.removeLast();
    }
}
