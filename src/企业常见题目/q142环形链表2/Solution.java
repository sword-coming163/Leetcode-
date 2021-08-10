package 企业常见题目.q142环形链表2;

import java.util.HashSet;
import java.util.Set;

/**
 * @author zhang
 * @title: Solution
 * @projectName Leetcode-
 * @description: TODO
 * @date 2021/8/1:11:49
 */
public class Solution {
    /**
      * @param head
      * @description: 使用HashSet存储
      * @return {@link ListNode}
      * @throws
      * @author zhang
      * @date 2021/8/1 11:50
     */
    public ListNode detectCycle(ListNode head) {
        Set<ListNode> set = new HashSet<>();
        if (head==null||head.next==null){
            return null;
        }
        while (head!=null){
            if (set.contains(head)){
                return head;
            }
            set.add(head);
            head = head.next;
        }
        return null;
    }
    public ListNode detectCycle1(ListNode head) {
        ListNode fast = head, slow = head;
        while (true) {
            if (fast == null || fast.next == null) return null;
            fast = fast.next.next;
            slow = slow.next;
            if (fast == slow) break;
        }
        fast = head;
        while (slow != fast) {
            slow = slow.next;
            fast = fast.next;
        }
        return fast;
    }
}
