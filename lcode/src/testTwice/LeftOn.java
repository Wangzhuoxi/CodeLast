package testTwice;

import java.util.ArrayList;

public class LeftOn{
    public int LastRemaining_Solution(int n, int m) {
        ArrayList<Integer> list=new ArrayList<>();
        for(int i=0;i<n;i++)
            list.add(i);
        int cur=0;
        while(list.size()>1)
        {
            cur=(cur+m-1)%list.size();
            list.remove(cur);
        }
return list.get(0);
    }
}
