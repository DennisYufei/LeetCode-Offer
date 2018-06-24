package offer;

/**
 * 面试题15：找到链表倒数第k个结点
 * 思路：定义两个指针，第一个指针向前先走k-1步，第二个指针不动，从第k步开始，第二个指针也开始从头开始遍历，
 * 当第一个指针到达尾结点时，第二个指针正还是倒数第k个结点。
 * 注意：代码的鲁棒性
 * 当k为0或者输入的链表头指针为null即空链表会容易出现，所以需要在方法中加入if判断，保证代码鲁棒性
 * Created by Dennis on 2018/6/23.
 */
public class Problem15FindKthToTail {

    public ListNode findKthToTail(ListNode head, int k){
        if(head == null || k == 0){
            return null;
        }
        ListNode resultNode = null;
        ListNode headNode = head;
        for (int i = 0; i < k; i++) {
            if(headNode.next != null){
                headNode = headNode.next;
            }else {
                return null;
            }
        }
        resultNode = head;
        while(headNode != null){
            resultNode = resultNode.next;
            headNode = headNode.next;
        }
        System.out.println(resultNode.data);
        return resultNode;
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
        Problem15FindKthToTail p = new Problem15FindKthToTail();
        p.findKthToTail(head,4);
    }

}
