package testTwice;

import java.util.ArrayList;
import java.util.Queue;

public class FindSumInString {
    /**
     * 对每一个数开头的都建立一个list，判断是否可能达到目标。
     * @param sum
     * @return
     */
    public ArrayList<ArrayList<Integer>> FindContinuousSequence(int sum) {
        ArrayList<ArrayList<Integer>> lists=new ArrayList<>();
        if(sum<3)
            return lists;
        for(int i=1;i<=sum/2;i++) {
            int temp = 0;
            ArrayList<Integer> list = new ArrayList<>();
            int start = i;
            while ( temp < sum) {
                temp += start;
                list.add(start);
                start++;
            }
            if (temp == sum)
                lists.add(list);
        }
        return lists;



    }


}
