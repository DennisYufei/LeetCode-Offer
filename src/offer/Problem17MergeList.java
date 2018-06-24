package offer;

/**
 * 面试题17：合并两个排序链表
 * Created by Dennis on 2018/6/24.
 */
public class Problem17MergeList {

    public ListNode mergeList(ListNode head1, ListNode head2) {
        if (head1 == null) {
            return head2;
        } else if (head2 == null) {
            return head1;
        }
        ListNode result = null;
        if (head1.data < head2.data) {
            result = head1;
            result.next = mergeList(head1.next, head2);
        }else {
            result = head2;
            result.next = mergeList(head1, head2.next);
        }
        return result;
    }

    public static void main(String[] args) {
        ListNode head1 = new ListNode();
        ListNode second1 = new ListNode();
        ListNode third1 = new ListNode();
        ListNode forth1 = new ListNode();
        head1.next = second1;
        second1.next = third1;
        third1.next = forth1;
        head1.data = 1;
        second1.data = 3;
        third1.data = 5;
        forth1.data = 7;
        ListNode head2 = new ListNode();
        ListNode second2 = new ListNode();
        ListNode third2 = new ListNode();
        ListNode forth2 = new ListNode();
        head2.next = second2;
        second2.next = third2;
        third2.next = forth2;
        head2.data = 2;
        second2.data = 4;
        third2.data = 6;
        forth2.data = 8;
        Problem17MergeList p = new Problem17MergeList();
        ListNode result = p.mergeList(head1, head2);
        while (result != null) {
            System.out.print(result.data + " ");
            result = result.next;
        }
    }
}
