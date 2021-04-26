package 链表.链表反转q206;

public class Solution {
    public ListNode reverseList(ListNode head) {
        if(head == null||head.next==null){
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

    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);
        Solution solution = new Solution();
        ListNode newHead = solution.reverseList(head);
        System.out.println("111111111111");
        ListNode.printListNode(newHead);
    }
}
