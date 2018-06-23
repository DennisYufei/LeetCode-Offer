package offer;

/**
 * 面试题13：删除链表结点
 * 思路：三种情况需要考虑清楚
 * 1、只有一个结点，既是头结点也是尾结点
 * 2、删除尾结点
 * 3、链表为空
 * Created by Dennis on 2018/6/23.
 */
public class Problem13DeleteNode {

    public void delete(ListNode head, ListNode toDelete){
        if(toDelete == null){
            return ;
        }
        if(toDelete.next != null){//删除的节点不是尾节点
            toDelete.data = toDelete.next.data;
            toDelete.next = toDelete.next.next;
        }else if(head == toDelete){//链表只有一个节点，删除头结点也是尾节点
            head = null;
        }else{ //删除的节点是尾节点的情况
            ListNode node = head;
            while(node.next != toDelete){//找到倒数第二个节点
                node = node.next;
            }
            node.next = null;
        }
    }

    public static void main(String[] args) {
        ListNode head = new ListNode();
        ListNode second = new ListNode();
        ListNode third = new ListNode();
        head.next = second;
        second.next = third;
        head.data = 1;
        second.data = 2;
        third.data = 3;
        Problem13DeleteNode p = new Problem13DeleteNode();
        p.delete(head,third);
        System.out.println(head.data+" "+head.next.data);
    }

}
