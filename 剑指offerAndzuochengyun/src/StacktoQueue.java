import java.util.Queue;
import java.util.Stack;

public class StacktoQueue {
    /**
     * 两个队列实现栈，弹出除了最后一个数给另一个队列
     * 队列 add poll
     */
    public  static class QueuetoStack{
       private static Queue<Integer> data;
      private static Queue<Integer> help;
        private Integer peek()
        {
            if(data.isEmpty())
                return null;
            while(data.size()>1)
            {
              help.add(data.poll());

            }
            int last=data.poll();
            help.add(last);
          swap();
          return last;
        }
        private Integer pop()
        { if(data.isEmpty())
            return null;
        while(data.size()>1)
        {
            help.add(data.poll());
        }
        int last=data.poll();
        swap();
        return last;

        }
        public static void swap()
        {
            Queue<Integer> temp=help;
          help=data;
          data=temp;
        }
    }

    public  static class StacktoQue{
        private static Stack<Integer> push;
        private static Stack<Integer> pop;
        private Integer poll()
        {
            while(push.size()>=0)
            {
                pop.push(push.pop());
            }
            return push.pop();

        }
    }
}
