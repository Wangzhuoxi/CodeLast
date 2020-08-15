package StackAndQueue;

import java.util.Stack;

/**
 * 只用递归函数和栈来逆序一个栈
 */
public class ReverseStack {
    //递归来找到栈底元素，并弹出。12345->1234
    public Integer getLastNode(Stack<Integer> stack)
    {
        int result=stack.pop();
        if(stack.isEmpty())
            return result;
        else
        {
            int last=getLastNode(stack);
            stack.push(result);
            return last;
        }
    }
    //利用get栈底方法来reverse
    public void reverseStack(Stack<Integer> stack)
    {
        if(stack.isEmpty())
            return;
        //最后从get栈底方法出来的int是栈顶，最先被push进去。
        int temp=getLastNode(stack);
        reverseStack(stack);
        stack.push(temp);



    }

}
