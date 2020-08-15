import jdk.nashorn.internal.runtime.Debug;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class Code15ThreeSum {


        public List<List<Integer>> fourSum(int[] nums, int target) {
            Arrays.sort(nums);
            int m=0;
            int n=0;
            HashSet  <List<Integer>> lists=new HashSet<>();

            for(int i=0;i<=nums.length-4;i++)
            {
                for(int j=i+1;j<=nums.length-3;j++) {

                    m = j + 1;
                    n = nums.length - 1;
                    while (m < n) {
                        if (nums[i] + nums[j] + nums[m] + nums[n] == target) {
                            List<Integer> list = new ArrayList<>();
                            list.add(nums[i]);
                            list.add(nums[j]);
                            list.add(nums[m]);
                            list.add(nums[n]);
                            lists.add(list);
                            m++;
                            while (m<n&&nums[m]==nums[m-1])
                                m++;
                            n--;
                            while(m<n&&nums[n]==nums[n+1])
                                n--;

                        }
                        else if (m < n&&nums[i] + nums[j] + nums[m] + nums[n] > target)
                        {
                            n--;


                        }

                        else
                        {
                            m++;

                        }


                    }
                }
            }
            return new ArrayList<>(lists);
        }
    }
