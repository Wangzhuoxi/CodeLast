package jianzhioffer;

import java.util.LinkedList;
import java.util.Queue;

public class Code13ReOrderArray_RESEE {
    public void reOrderArray(int [] array) {
        Queue<Integer> queue=new LinkedList<>();
        int index=0;
        for(int i=0;i<array.length;i++)
        {
            if((array[i]&1)==1)//&1==1表示奇数
            {
                array[index++]=array[i];
            }
            else
                queue.add(array[i]);
        }
        for(int i=index;i<array.length;i++)
            array[i]=queue.poll();

    }

}
