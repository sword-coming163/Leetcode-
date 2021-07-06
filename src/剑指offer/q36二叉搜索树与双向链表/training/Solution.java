package 剑指offer.q36二叉搜索树与双向链表.training;

public class Solution {
    //如果需要找寻父节点，可以定义全局的变量进行保存，使得在进行递归操作时不会丢失
    Node pre,head;
    public Node treeToDoublyList(Node root) {
        //dfs+中序遍历
        if (root==null){
            return null;
        }
        dfs(root);
        head.left = pre;
        pre.right = head;
        return head;

    }
    public void dfs(Node curr){
        if (curr==null){
            return;
        }
        dfs(curr.left);
        if (pre==null){
            head = curr;
        }else {
            pre.right = curr;
        }
        curr.left = pre;
        pre = curr;
        dfs(curr.right);
    }
}
