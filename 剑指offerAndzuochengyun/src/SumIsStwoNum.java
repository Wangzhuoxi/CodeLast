import java.util.ArrayList;

public class SumIsStwoNum {
    public ArrayList<Integer> FindNumbersWithSum(int [] array, int sum) {
        ArrayList<Integer> list=new ArrayList<>();
        int l=0;
        int r=array.length-1;
        while (l<r)
        {
            if(array[l]+array[r]==sum)
            {
                list.add(array[l]);
                list.add(array[r]);
                return list;
            }
            else
                if(array[l]+array[r]>sum)
                    r--;
                else
                    l++;

        }
        return list;

    }
}
