package 二叉搜索树相关.从前序遍历和中序遍历序列构造二叉树q105;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    Map<Integer,Integer> hashmap = new HashMap<>();
    int[] preorder;
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        this.preorder = preorder;
        //创建一个hashmap,保存前序遍历的结果
        if(preorder==null||inorder==null){
            return null;
        }
        for (int i = 0; i < inorder.length; i++) {
            hashmap.put(inorder[i],i);
        }
        return build(0,0,inorder.length-1);

    }

    private TreeNode build(int pre_root, int in_left, int in_right) {
        if(in_left > in_right) return null;
        TreeNode root = new TreeNode(preorder[pre_root]);
        //根节点在中序遍历数组中对应的索引
        int in_root = hashmap.get(preorder[pre_root]);
        root.left = build(pre_root+1,in_left,in_root-1);
        root.right = build(pre_root+(in_root-in_left)+1,in_root+1,in_right);
        return root;
    }

    public static void main(String[] args) {
        int[] preorder = new int[]{3,9,20,15,7};
        int[] inorder = new int[]{9,3,15,20,7};
        System.out.println(new Solution().buildTree(preorder,inorder));
    }
}
