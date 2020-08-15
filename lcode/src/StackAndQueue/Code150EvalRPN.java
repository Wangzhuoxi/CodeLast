package StackAndQueue;

import java.util.Stack;

public class Code150EvalRPN {
    public static int evalRPN(String[] tokens) {
        Stack<Integer> stack=new Stack<Integer>();
        for(int i=0;i<tokens.length;i++)
        {
            if(tokens[i].equals("+")||tokens[i].equals("-")||tokens[i].equals("*")||tokens[i].equals("/"))
            {
                int b=stack.pop();
                int a=stack.pop();
                if(tokens[i].equals("+"))
                stack.push(a+b);
                if(tokens[i].equals("-"))
                    stack.push(a-b);
                if(tokens[i].equals("*"))
                    stack.push(a*b);
                if(tokens[i].equals("/"))
                    stack.push(a/b);
            }
            else
                stack.push(Integer.valueOf(tokens[i]));
        }
        return stack.peek();
    }

    public static void main(String[] args) {
        String[] temp={"2", "1", "+", "3", "*"};
        System.out.println(evalRPN(temp));

    }
}
