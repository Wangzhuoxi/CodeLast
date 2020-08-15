import java.util.HashMap;

public class Code567IsInclude {
    /**
     * 写一个函数来判断 s2 是否包含 s1 的排列。
     * @param s1
     * @param s2
     * @return
     */
 public boolean checkInclusion(String s1, String s2) {
     int left = 0;
     int right = 0;
     int valid = 0;
     HashMap<Character, Integer> map1 = new HashMap<>();
     HashMap<Character, Integer> map2 = new HashMap<>();
     for (Character c : s1.toCharArray())
         map1.put(c, map1.getOrDefault(c, 0) + 1);
     while (right < s2.length()) {
         char temp = s2.charAt(right);
         right++;
         if (map1.containsKey(temp)) {
             map2.put(temp, map2.getOrDefault(temp, 0) + 1);
             if (map1.get(temp).intValue() == map2.get(temp).intValue())
                 valid++;
         }
         //left右移动条件
         while (right - left >= s1.length()) {
             if (valid == map1.size())
                 return true;
             char delete = s2.charAt(left);
             if (map1.containsKey(delete)) {
                 if (map1.get(delete).intValue() == map2.get(delete).intValue())
                     valid--;
                 map2.put(delete, map2.get(delete) - 1);

             }
             left++;

         }
     }
     return false;
 }


 }
