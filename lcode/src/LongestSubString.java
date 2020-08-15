public class LongestSubString {
    //用数组记录每一个字符出现的频率。
    public int lengthOfLongestSubstring(String s) {

        if (s == null || s.length() == 0)
            return 0;

        int[] arr = new int[256];
        int l = 0;
        int r = 0;
        int max = 0;
        while (r < s.length()) {

            if (arr[s.charAt(r)] == 0) {
                arr[s.charAt(r++)]++;
                max = Math.max(max, r - l);

            } else {
                arr[s.charAt(l)]--;
                l++;
            }
        }
        return max;
    }
}
