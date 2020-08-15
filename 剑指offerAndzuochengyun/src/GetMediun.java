import java.util.Comparator;
import java.util.PriorityQueue;

public class GetMediun {
    int count = 0;
    PriorityQueue<Integer> minHeap = new PriorityQueue<>();//默认升序
   PriorityQueue<Integer> maxHeap=new PriorityQueue<>(new Comparator<Integer>() {
       @Override
       public int compare(Integer o1, Integer o2) {
           return o2.compareTo(o1);
       }
   });

    public void Insert(Integer num) {
      count++;
      if((count&1)==1)
      {
          minHeap.offer(num);
          maxHeap.offer(minHeap.poll());

      }
      else
      {
          maxHeap.offer(num);
          minHeap.offer(maxHeap.poll());
          }
    }

    public Double GetMedian() {
        if (count == 0)
            return null;

        // 当数据个数是奇数时，中位数就是大根堆的顶点
        if ((count & 1) == 1) {
            return Double.valueOf(maxHeap.peek());
        } else {
            return Double.valueOf((minHeap.peek() + maxHeap.peek())) / 2;
        }
    }

}
