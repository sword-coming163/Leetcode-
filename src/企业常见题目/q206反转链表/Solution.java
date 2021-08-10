package 企业常见题目.q206反转链表;

/**
 * @author zhang
 * @title: Solution
 * @projectName Leetcode-
 * @description: TODO
 * @date 2021/7/31:10:49
 */
public class Solution {
    /**
      * @param head
      * @description: 使用临时节点依次反转
      * @return {@link ListNode}
      * @throws
      * @author zhang
      * @date 2021/7/31 10:52
     */
//    public ListNode reverseList(ListNode head){
//        if (head==null){
//            return null;
//        }
//        ListNode pre = null;
//        ListNode curr = head;
//        while (curr!=null){
//            ListNode next = curr.next;
//            curr.next = pre;
//            pre =curr;
//            curr = next;
//        }
//        return pre;
//    }
    /**
      * @param head
      * @description: 使用递归进行反转
      * @return {@link ListNode}
      * @throws
      * @author zhang
      * @date 2021/7/31 10:53
     */
    public ListNode reverseList(ListNode head){
        if (head==null||head.next==null){
            return head;
        }
        ListNode newHead = reverseList(head.next);
        head.next.next = head;
        head.next = null;
        return newHead;
    }
}
