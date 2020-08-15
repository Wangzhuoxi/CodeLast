import java.util.ArrayList;
import java.util.LinkedList
;
public class MaxInWindows {
    public ArrayList<Integer> maxInWindows(int [] num, int size)
    {
        if(num==null||num.length==0)
            return null;
        LinkedList<Integer> queue=new LinkedList<>();
     ArrayList<Integer> list=new ArrayList<>();

        for(int i=0;i<num.length;i++)
        {

                    while(!queue.isEmpty()&&num[i]>=queue.peekLast())
                        queue.pollLast();
                    queue.addLast(i);
                    if(queue.peekFirst()==i-size)
                        queue.pollFirst();
                    if(i>=size-1)
                    {
                       list.add(num[queue.peekFirst()]);
                    }
                }
        return list;

        }


    }

