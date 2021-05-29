package 剑指offer.q25合并两个排序的链表;

public class Solution {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode newHead = new ListNode(0);
        ListNode pre = newHead;
        if (l1==null){
            return l2;
        }else if (l2==null){
            return l1;
        }
        while (l1!=null&&l2!=null){
            if (l1.val< l2.val){
                pre.next = l1;
                l1 = l1.next;
            }else {
                pre.next = l2;
                l2 = l2.next;
            }
            pre = pre.next;
        }
        pre.next = l1!=null?l1:l2;
        return newHead.next;

    }

    public static void main(String[] args) {
        int[] list1 = new int[]{1,2,4};
        int[] list2 = new int[]{1,3,5,6};
        ListNode listNode1 = new ListNode(list1);
        ListNode listNode2 = new ListNode(list2);
        System.out.println(listNode1);
        System.out.println(listNode2);
        System.out.println(new Solution().mergeTwoLists(listNode1,listNode2));
    }

}
