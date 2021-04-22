package 链表.旋转链表q61;

public class Solution {
    public ListNode rotateRight(ListNode head, int k) {
        if (head==null||k==0||head.next==null){
            return head;
        }
        int length = 1;
        int index = 0;
        ListNode temp = head;
        ListNode newHead = head;
        while (temp.next!=null){
            temp = temp.next;
            length++;
        }
        index = k % length;
        if(index == 0){
            return head;
        }
        temp.next = head;
        for (int i = 0; i < length-index; i++) {
            temp = temp.next;
        }
        newHead = temp.next;
        temp.next = null;
        return newHead;
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);
        Solution solution = new Solution();
        ListNode newHead = solution.rotateRight(head,2);
        ListNode.printListNode(newHead);


    }
}
