package Backtrace;

import javax.management.AttributeList;
import java.util.ArrayList;
import java.util.List;

public class ArrayPermute {
    public static List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();
        getAllPermute(res, nums, temp);
        return res;
    }
    public static void getAllPermute( List<List<Integer>> res ,int[] nums, List<Integer> temp){
        if(temp.size()==nums.length){
            res.add(new ArrayList<>(temp));
            return;
        }
        for(int i=0;i<nums.length;i++){
            if(temp.contains(nums[i]))
                continue;
            temp.add(nums[i]);
            getAllPermute(res,nums,temp);
            temp.remove(temp.size()-1);

        }
    }

    public static void main(String[] args) {
        int[] a={1,2,3};

        System.out.println(permute(a));
    }
}
