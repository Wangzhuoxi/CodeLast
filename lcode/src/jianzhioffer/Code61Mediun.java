package jianzhioffer;

import java.util.Comparator;
import java.util.PriorityQueue;
//count后++
public class Code61Mediun {
    int count=0;
    //默认xiao根堆
    PriorityQueue<Integer> small=new PriorityQueue<>();
    //大根堆
    PriorityQueue<Integer> big=new PriorityQueue<>(11, new Comparator<Integer>() {
        @Override
        public int compare(Integer o1, Integer o2) {
            return o2-o1;
        }
    });

    public void Insert(Integer num) {

        //奇数则在小根堆插入,是否大于大根堆的最大值
        if(count%2==0)
        {
            big.offer(num);
            int last=big.poll();
            small.offer(last);
        }
        else
        {
            small.offer(num);
            int last=small.poll();
            big.offer(last);
        }
        count++;

    }

    public Double GetMedian() {
        if(count%2==0)
            return new Double(big.peek()+small.peek())/2;
        else
            return new Double(small.peek());


    }
}
