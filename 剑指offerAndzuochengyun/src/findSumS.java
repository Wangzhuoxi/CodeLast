import java.util.ArrayList;

public class findSumS {
    public ArrayList<ArrayList<Integer>> FindContinuousSequence(int sum) {
        ArrayList<ArrayList<Integer>> lists=new ArrayList<>();
        ArrayList<Integer> list=new ArrayList<>();
        if(sum<3)
            return lists;
        int small=1;
        int big =2;
        while(small<(sum+1)/2)
        {
            int s=0;
            for(int temp=small;temp<=big;temp++)
            {
                s+=temp;
            }
            if(s==sum)
            {
                list.clear();
                for(int i=small;i<=big;i++)
                    list.add(i);
                lists.add(list);
            }
            else
                if(s>sum)
                    big--;
                else
                    small++;
        }
return lists;
    }
}
