package 企业常见题目.q142环形链表2;

/**
 * @author zhang
 */
public class ListNode {
    int val;
    ListNode next;

    public ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }

    public ListNode() {
    }

    public ListNode(int val) {
        this.val = val;
    }
    //定义一个构造函数，使得可以通过数组来构造链表
    public ListNode(int[] nums){
        if (nums==null||nums.length==0){
            System.out.println("输入数组异常");
        }
        this.val = nums[0];
        ListNode curr = this;
        for (int i = 1; i < nums.length; i++) {
            curr.next = new ListNode(nums[i]);
            curr = curr.next;
        }
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        ListNode curr = this;
        while (curr!=null){
            stringBuilder.append(curr.val);
            stringBuilder.append("->");
            curr = curr.next;
        }
        stringBuilder.append("Null");
        return stringBuilder.toString();
    }
}
