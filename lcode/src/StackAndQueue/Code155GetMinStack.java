package StackAndQueue;

import java.util.Stack;

public class Code155GetMinStack {

    class MinStack {

        /** initialize your data structure here. */
        Stack<Integer> stackData;
        Stack<Integer> stackMin;
        /** initialize your data structure here. */
        public MinStack() {
            stackData=new Stack<Integer>();
            stackMin=new Stack<Integer>();
        }

        public void push ( int x){
            stackData.push(x);
            if(stackMin.isEmpty())
                stackMin.push(x);
            else {
                if (stackMin.peek() >= x)
                    stackMin.push(x);
            }
        }

        public void pop () {

            int x=stackData.pop();
            if(x==stackMin.peek())
                stackMin.pop();

        }

        public int top () {
            return stackData.peek();
        }

        public int getMin () {
            if(stackMin.isEmpty())
                throw new RuntimeException("Empty!");
            return stackMin.peek();

        }
    }

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(x);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */
}
