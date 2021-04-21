package 链表.delletq79;

public class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummyNode = new ListNode();
        dummyNode.next = head;
        ListNode first = head;
        ListNode second = dummyNode;
        for (int i = 0; i < n; i++) {
            first = first.next;
        }
        while (first!=null){
            second = second.next;
            first = first.next;
        }
        second.next = second.next.next;
        return dummyNode.next;

    }

    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);
        Solution solution = new Solution();
        ListNode newHead = solution.removeNthFromEnd(head,2);
//        ListNode temp = head;
//        while (temp!=null){
//            System.out.println(temp.val);
//            temp = temp.next;
//        }
        head.printListNode(newHead);
    }
}
