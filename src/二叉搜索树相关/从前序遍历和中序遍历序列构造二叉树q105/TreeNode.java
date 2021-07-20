package 二叉搜索树相关.从前序遍历和中序遍历序列构造二叉树q105;

public class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    static StringBuilder stringBuilder = new StringBuilder();

    public TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }

    public TreeNode() {
    }

    public TreeNode(int val) {
        this.val = val;
    }
    //前序遍历
    public static String preOrder(TreeNode root){
        if (root==null){
            stringBuilder.append("->Null");
            return null;
        }
        stringBuilder.append("->");
        stringBuilder.append(root.val);
        preOrder(root.left);
        preOrder(root.right);
        return stringBuilder.toString();
    }


}
