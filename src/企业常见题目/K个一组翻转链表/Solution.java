package 企业常见题目.K个一组翻转链表;

import org.junit.Test;

/**
 * @author zhang
 * @title: Solution
 * @projectName Leetcode-
 * @description: TODO
 * @date 2021/8/7:10:08
 */
public class Solution {
    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        //找到四个链表点，吧需要翻转的链表切分出来翻转后进行连接
        ListNode pre = dummy;
        ListNode end = dummy;
        while (end!=null){
            for (int i = 0; i < k&&end!=null; i++) {
                end = end.next;
            }
            if (end==null){
                break;
            }
            ListNode start = pre.next;
            ListNode next = end.next;
            end.next = null;
            pre.next = reverse(start);
            start.next = next;
            pre = start;
            end = pre;
        }
        return dummy.next;
    }
    /**
      * @param head
      * @description: 链表翻转
      * @return {@link ListNode}
      * @throws
      * @author zhang
      * @date 2021/8/7 10:10
     */
    private ListNode reverse(ListNode head){
        ListNode pre = null;
        ListNode curr = head;
        while (curr!=null){
            ListNode next = curr.next;
            curr.next = pre;
            pre = curr;
            curr = next;
        }
        return pre;
    }
    @Test
    public void testReverse(){
        ListNode head = new ListNode(new int[]{1,2,3,4,5});
        System.out.println(head);
        System.out.println(reverse(head));
    }
}
