package offer;

/**
 * 面试题16：反转链表，输入一个链表的头结点，反转该链表并输出反转后链表的头结点
 * 思路：需要定义3个指针，分别指向当前遍历到的结点，前一个结点和后一个结点以防止链表断裂
 * Created by Dennis on 2018/6/24.
 */
public class Problem16ReverseList {

    public ListNode reverseList(ListNode head) {
        if (head == null)
            return null;
        ListNode preListNode = null;
        ListNode nowListNode = head;
        while (nowListNode != null) {
            ListNode nextListNode = nowListNode.next;   //保存下一个结点
            nowListNode.next = preListNode;             //当前结点指向前一个结点
            preListNode = nowListNode;                  //前任结点 到现任节点
            nowListNode = nextListNode;                 //现任节点到下一结点
        }
        return preListNode;
    }


    public static void main(String[] args) {
        ListNode head = new ListNode();
        ListNode second = new ListNode();
        ListNode third = new ListNode();
        ListNode forth = new ListNode();
        head.next = second;
        second.next = third;
        third.next = forth;
        head.data = 1;
        second.data = 2;
        third.data = 3;
        forth.data = 4;
        Problem16ReverseList p = new Problem16ReverseList();
        ListNode result = p.reverseList(head);
        System.out.println(result.data);
    }

}
