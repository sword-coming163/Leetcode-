package 链表.两两交换链表中的节点q24;

public class Solution {
    public ListNode swapPairs(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode newHead = head.next;
        head.next = swapPairs(newHead.next);
        newHead.next = head;
        return newHead;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{1,2,3,4};
        ListNode head = new ListNode(nums);
        System.out.println(head);
        System.out.println(new Solution().swapPairs(head));
    }
}
