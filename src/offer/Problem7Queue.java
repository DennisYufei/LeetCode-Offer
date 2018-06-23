package offer;

import java.util.Stack;

/**
 * 面试题7：两个栈实现队列，并实现两个函数的功能 appendTail和deleteHead，完成在队列尾部插入结点和在头部删除结点功能
 *
 * Created by Dennis on 2018/6/23.
 */
public class Problem7Queue<T> {

    Stack<T> stack1 = new Stack<T>();
    Stack<T> stack2 = new Stack<T>();

    public void appendTail(T t){
        stack1.push(t);
        System.out.print(stack1+" ");
    }

    public T deleteHead() throws Exception{
        if(stack2.isEmpty()){
            while(!stack1.isEmpty()){
                stack2.push(stack1.pop());
            }
        }
        if(stack2.isEmpty()){
            throw new Exception("队列为空，不能删除");
        }
        System.out.println(stack2);
        return stack2.pop();
    }

    public static void main(String[] args)throws Exception {
        Problem7Queue p = new Problem7Queue();
        p.appendTail("1");
        p.appendTail("2");
        p.appendTail("3");
        p.deleteHead();
        p.deleteHead();

    }

}
