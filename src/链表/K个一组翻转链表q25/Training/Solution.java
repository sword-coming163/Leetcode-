//package 链表.K个一组翻转链表q25.Training;
//
///**
// * @author zhang
// * @title: Solution
// * @projectName Leetcode-
// * @description: 使用递归
// * @date 2021/7/18:16:31
// */
//public class Solution {
//    public ListNode reverseKGroup(ListNode head, int k) {
//        ListNode dummy = new ListNode();
//        ListNode kListNode = head;
//        ListNode curr = head;
//        int count = 0;
//        while (kListNode!=null){
//            count++;
//            kListNode = kListNode.next;
//        }
//
////    }
//    public ListNode reverse(ListNode head) {
//        ListNode pre = null;
//        ListNode curr = head;
//        while (curr!=null){
//            ListNode next = curr.next;
//            curr.next = pre;
//            pre = curr;
//            curr = next;
//        }
//        return pre;
//    }
//
//    public static void main(String[] args) {
//        int[] nums = new int[]{1,2,3,4,5};
//        ListNode head = new ListNode(nums);
//        System.out.println(head);
//        System.out.println(new Solution().reverseKGroup(head,2));
//    }
//}
