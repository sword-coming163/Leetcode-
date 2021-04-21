package 链表.两数相加q2;

public class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode head = null;
        ListNode tail = null;
        ListNode listNode = new ListNode();
        int carry = 0;
        int rs = 0;
        int a1 = 0;
        int a2 = 0;
        while (l1!=null||l2!=null){
            if(l1!=null){
                a1 = l1.val;
                l1 = l1.next;
            }else {
                a1 = 0;
            }
            if(l2!=null){
                a2 = l2.val;
                l2 = l2.next;
            }else {
                a2 = 0;
            }
            rs = a1+a2+carry;
            carry = rs/10;
            if (head==null){
                head = new ListNode(rs%10);
                tail = head;
            }else {
                tail.next = new ListNode(rs%10);
                tail = tail.next;
            }
        }
        if (carry>0){
            tail.next = new ListNode(carry);
        }
        return head;
    }

    public static void main(String[] args) {
        ListNode l1 = new ListNode(2);
        l1.next = new ListNode(4);
        l1.next.next = new ListNode(3);
        ListNode l2 = new ListNode(5);
        l2.next = new ListNode(6);
        l2.next.next = new ListNode(4);
        Solution solution = new Solution();
        ListNode head = solution.addTwoNumbers(l1,l2);
        ListNode temp = new ListNode();
        temp = head;
        while (temp!=null){
            System.out.println(temp.val);
            temp = temp.next;
        }
    }
}
