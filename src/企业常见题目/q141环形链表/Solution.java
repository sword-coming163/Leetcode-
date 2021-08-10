package 企业常见题目.q141环形链表;

import java.util.List;

/**
 * @author zhang
 * @title: Solution
 * @projectName Leetcode-
 * @description: TODO
 * @date 2021/8/1:11:34
 */
public class Solution {
    /**
      * @param head
      * @description: //定义两个指针。一个走一步，一个走两步，直到两个指针相等
      * @return {@link boolean}
      * @throws
      * @author zhang
      * @date 2021/8/1 11:36
     */
    public boolean hasCycle(ListNode head) {
        if (head==null){
            return false;
        }
        ListNode first = head;
        ListNode second = head;
        while (second!=null&&second.next!=null&&second.next.next!=null){
            first = first.next;
            second = second.next.next;
            if (first==second){
                return true;
            }
        }
        return false;
    }
}
