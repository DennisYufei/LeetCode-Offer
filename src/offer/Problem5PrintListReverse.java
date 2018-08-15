package offer;

import java.util.ArrayList;
import java.util.Stack;

/**
 * 面试题5：输入一个链表的头结点，从尾到头反过来打印出每个结点的值
 * 思路：1、第一个遍历的最后一个输出，典型的后进先出，可以用栈，将结点放到栈中，然后遍历完后从栈顶输出值
 * Created by Dennis on 2018/6/23.
 */
public class Problem5PrintListReverse {

    public static ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
        Stack stack = new Stack();
        ArrayList list = new ArrayList();
        while (listNode != null) {
            stack.push(listNode.data);
            listNode = listNode.next;
        }
        while (!stack.isEmpty()) {
            list.add(stack.pop());
        }
        return list;
    }

    public static void main(String[] args) {
        ListNode listNode1 = new ListNode();
        ListNode listNode2 = new ListNode();
        ListNode listNode3 = new ListNode();

        listNode1.data = 1;
        listNode2.data = 2;
        listNode3.data = 3;
        listNode1.next = listNode2;
        listNode2.next = listNode3;

        ArrayList<Integer> list = printListFromTailToHead(listNode1);
        for (int i : list) {
            System.out.print(i + " ");
        }
    }
}


