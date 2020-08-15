package jianzhioffer;

import java.util.ArrayList;

public class Code41FindSllSumS_Resee {
    public ArrayList<ArrayList<Integer>> FindContinuousSequence(int sum)
    {
        ArrayList<ArrayList<Integer>> lists=new ArrayList<>();
        if(sum<3)
            return lists;
        int mid=(sum>>1)+1;
        for(int i=1;i<=mid;i++)
        {
            ArrayList<Integer> list=new ArrayList<>();
            int sumNow=0;
            int start=i;
            while(sumNow<sum)
            {
                sumNow+=start;
                list.add(start);
                start++;

            }
            if(sumNow==sum)
                lists.add(list);
        }
return lists;
    }
}
