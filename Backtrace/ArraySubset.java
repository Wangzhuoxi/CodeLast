package Backtrace;

import java.util.ArrayList;
import java.util.List;

public class ArraySubset {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> res=new ArrayList<>();
        List<Integer> temp=new ArrayList<>();
        dfs(res,temp,nums,0);
        return res;

    }
    public void dfs( List<List<Integer>> res,List<Integer> temp,int[] nums,int i){
        res.add(new ArrayList<>(temp));
        for(int j=i;j<nums.length;j++){
            temp.add(nums[j]);
            dfs(res,temp,nums,i+1);
            temp.remove(temp.size()-1);
        }
    }

}
  /*  public List<List<Integer>> subsets(int[] nums) {

        List<List<Integer>> res = new ArrayList<List<Integer>>();

        List<Integer> temp = new ArrayList<Integer>();

        dfs(res, temp, nums, 0);

        return res;

    }

    private void dfs(List<List<Integer>> res, List<Integer> temp, int[] nums, int j) {

        res.add(new ArrayList<Integer>(temp));

        for(int i = j; i < nums.length; i++) {

            temp.add(nums[i]); //① 加入 nums[i]

            dfs(res, temp, nums, i + 1); //② 递归

            temp.remove(temp.size() - 1); //③ 移除 nums[i]

        }

    }

}*/


