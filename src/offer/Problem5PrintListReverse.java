package offer;

import java.util.Stack;

/**
 * 面试题5：输入一个链表的头结点，从尾到头反过来打印出每个结点的值
 * 思路：1、第一个遍历的最后一个输出，典型的后进先出，可以用栈，将结点放到栈中，然后遍历完后从栈顶输出值
 *      2、递归本质上就是一个栈结构，想到栈就有递归实现，每访问一个结点的时候，先递归输出它后面的结点，再输出它本身
 * Created by Dennis on 2018/6/23.
 */
public class Problem5PrintListReverse {

    //非递归实现
    public void printListReverse1(ListNode headNode){
        Stack<ListNode> stack = new Stack<>();
        while (headNode != null){
            stack.push(headNode);
            headNode = headNode.next;
        }
        while (!stack.isEmpty()){
            System.out.print(stack.pop().data+" ");
        }
    }

    //递归实现
    public void printListReverse2(ListNode headNode){
        if(headNode != null){
            if(headNode.next != null){
                printListReverse2(headNode.next);
            }
        }
        System.out.print(headNode.data+" ");
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

        Problem5PrintListReverse p = new Problem5PrintListReverse();
 //       p.printListReverse1(listNode1);
        p.printListReverse2(listNode1);

    }

}
