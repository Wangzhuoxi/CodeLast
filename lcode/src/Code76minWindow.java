
import java.util.HashMap;
import java.util.Map;

/**
 * 给你一个字符串 S、一个字符串 T，请在字符串 S 里面找出：包含 T 所有字符的最小子串。
 */
public class Code76minWindow {
    public String minWindow(String s, String t) {
        int left=0;
        int right=0;
        int valid=0;
        int start=0;
        int len= -1;
        HashMap<Character,Integer> s_count=new HashMap<>();
        HashMap<Character,Integer> t_count=new HashMap<>();
        for(Character c:t.toCharArray())
            t_count.put(c,t_count.getOrDefault(c,0)+1);
        while (right<s.length()) {
            Character temp = s.charAt(right);
            //right右移
            right++;
            s_count.put(temp, s_count.getOrDefault(temp, 0) + 1);
            //进行窗口内数据的更新
            if (t_count.containsKey(temp)) {

                if (s_count.get(temp).intValue() == t_count.get(temp))
                    valid++;
            }
            //判断left是否要移
            while (left<=right&&valid == t_count.size()) {
                //在这里更新最短长度
                if (len==-1||right - left+1 < len) {
                    start = left;
                    len = right - left+1;
                }
                Character d = s.charAt(left);
                left++;
                if (t_count.containsKey(d)) {
                    if (s_count.get(d).intValue() == t_count.get(d).intValue()) {
                        valid--;

                    }
                    s_count.put(d, s_count.get(d) - 1);
                }

            }
        }

        return len==-1?"":s.substring(start,start+len-1);
    }
    public String minWindow2(String s, String t)
    {
        int left=0;
        int right=0;
        int valid=0;
        int len=-1;
        int start=0;
        //两个hashmap
        HashMap<Character,Integer> s_count=new HashMap<>();
        HashMap<Character,Integer> t_count=new HashMap<>();

        for(Character temp:t.toCharArray())
            t_count.put(temp,t_count.getOrDefault(temp,0)+1);

        while(right<s.length())
        {
            char c=s.charAt(right);
            right++;
            s_count.put(c,s_count.getOrDefault(c,0)+1);
            if (t_count.containsKey(c)){
                if(s_count.get(c)==t_count.get(c))
                    valid++;
            }
            while(left<=right&&valid==t_count.size())
            {
                if(len==-1||len>right-left+1)
                {
                    start=left;
                    len=right-left+1;
                }

                if(t_count.containsKey(s.charAt(left)))
                {if(s_count.get(s.charAt(left)).intValue()==t_count.get(s.charAt(left)).intValue())
                    valid--;
                    s_count.put(s.charAt(left),s_count.get(s.charAt(left))-1);
                }

                left++;
            }


        }

        return len==-1?"":s.substring(start,start+len-1);
    }


}
