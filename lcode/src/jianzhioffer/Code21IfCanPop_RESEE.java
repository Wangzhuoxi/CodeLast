package jianzhioffer;

import java.util.Stack;

public class Code21IfCanPop_RESEE {
    public boolean IsPopOrder(int [] pushA,int [] popA) {
        if ((pushA == null && popA == null) || (pushA.length == 0 && popA.length ==
                0)) {
            return true;
        }
        if (pushA == null || popA == null || pushA.length == 0 || popA.length == 0)
        {
            return false;
        }
        Stack<Integer> help=new Stack<>();
        int index=0;
        for(int i=0;i<pushA.length;i++)
        {
            help.push(pushA[i]);
            while(!help.isEmpty()&&popA[index]==help.peek())
            {
                help.pop();
                index++;
            }
        }
        return  help.isEmpty();

    }
}
