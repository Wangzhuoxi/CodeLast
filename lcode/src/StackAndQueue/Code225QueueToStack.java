package StackAndQueue;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

public class Code225QueueToStack {
    class MyStack {
public LinkedList<Integer> queue;
        /** Initialize your data structure here. */
        public MyStack() {
queue=new LinkedList<Integer>();
        }

        /** Push element x onto stack. */
        public void push(int x) {
queue.push(x);
        }

        /** Removes the element on top of the stack and returns that element. */
        public int pop() {
           return queue.pollFirst();

        }

        /** Get the top element. */
        public int top() {
            return queue.peekFirst();

        }

        /** Returns whether the stack is empty. */
        public boolean empty() {
            return queue.isEmpty();

        }
    }

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */
}
