package Bit_Manipulation;

public class Code136FindSingleNum {
    public int singleNumber(int[] nums) {
        int res = 0;
        for (int num : nums)
            res ^= num;
        return res;
    }
}
