package 剑指offer.q51两个链表的第一个公共节点;

public class ListNode {
    int val;
    ListNode next;

    public ListNode() {
    }

    public ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }

    public ListNode(int val) {
        this.val = val;
    }
    public ListNode(int[] nums){
        if (nums==null|| nums.length==0){
            throw new  IllegalArgumentException("参数异常");
        }
        this.val = nums[0];
        ListNode curr = this;
        for (int i = 1; i < nums.length; i++) {
            curr.next = new ListNode(nums[i]);
            curr= curr.next;
        }

    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        ListNode curr = this;
        while (curr!=null){
            stringBuilder.append(curr.val);
            stringBuilder.append("->");
            curr =curr.next;
        }
        stringBuilder.append("Null");
        return stringBuilder.toString();
    }
}
