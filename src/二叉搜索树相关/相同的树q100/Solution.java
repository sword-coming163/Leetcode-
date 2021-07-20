package 二叉搜索树相关.相同的树q100;

public class Solution {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        //前序遍历+递归
        if ((p==null&&q!=null)||(p!=null&&q==null)){
            return false;
        }else if (p==null&&q==null){
            return true;
        }

        return (p.val==q.val)&&(isSameTree(p.left,q.left))&&(isSameTree(p.right,q.right));
    }
}
