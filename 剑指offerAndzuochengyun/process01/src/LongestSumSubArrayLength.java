import java.util.HashMap;

public class LongestSumSubArrayLength {
    /**
     * 求数组中等于aim的最长的子数组的长度
     * @param arr
     * @param aim
     * @return
     */
    public static int maxLength(int[] arr, int aim){
        int sum=0;
        int len=0;
        //map保存当前和和位置
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        map.put(0, -1);
        for(int i=0;i<arr.length;i++)
        {
            sum+=arr[i];
            if(map.containsKey(sum-aim))
                len=Math.max(i-map.get(sum-aim),len);
            if(!map.containsKey(sum-aim))
                map.put(sum, i);
        }
        return len;
    }
}
