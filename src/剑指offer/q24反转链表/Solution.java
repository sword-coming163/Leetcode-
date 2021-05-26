package 剑指offer.q24反转链表;

public class Solution {
    public ListNode reverseList(ListNode head) {
        if (head==null||head.next==null){
            return head;
        }
        ListNode pre = null;
        ListNode curr = head;
        ListNode next = null;
        while (curr!=null){
            next = curr.next;
            curr.next = pre;
            pre = curr;
            curr = next;
        }
        return pre;
    }
    public ListNode reverseList1(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode newHead = reverseList(head.next);
        head.next.next = head;
        head.next = null;
        return newHead;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{1,2,3,4,5};
        ListNode head = new ListNode(nums);
        System.out.println(head);
        System.out.println(new Solution().reverseList(head));
    }
}
