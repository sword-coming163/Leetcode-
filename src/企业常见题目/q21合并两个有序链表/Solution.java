package 企业常见题目.q21合并两个有序链表;

/**
 * @author zhang
 * @title: Solution
 * @projectName Leetcode-
 * @description: TODO
 * @date 2021/8/1:10:48
 */
public class Solution {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if (l1==null){
            return l2;
        }else if (l2==null){
            return l1;
        }
        //定义一个哑结点，用于返回
        ListNode newHead;
        if (l1.val<=l2.val){
            newHead = new ListNode(l1.val);
            l1 = l1.next;
        }else {
            newHead = new ListNode(l2.val);
            l2 = l2.next;
        }
        ListNode curr = newHead;
        while (l1!=null&&l2!=null){
            if (l1.val<=l2.val){
                curr.next = l1;
                curr = l1;
                l1 = l1.next;
            }else {
                curr.next = l2;
                curr = l2;
                l2 = l2.next;
            }
        }
        curr.next = l1==null?l2:l1;
        return newHead;

    }

    public static void main(String[] args) {
        int[] l1 = new int[]{1,2,4};
        int[] l2 = new int[]{1,3,4};
        ListNode l01 = new ListNode(l1);
        ListNode l02 = new ListNode(l2);
        System.out.println(new Solution().mergeTwoLists(l01,l02));
    }
}
