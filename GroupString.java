import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class GroupString {
    /**
     * 将字符串数组根据字母的一致性分成不同的group
     * 用hashmap string list<String></>
     */
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> res=new ArrayList<>();
        HashMap<String,List<String> >map=new HashMap<>();
        int n=strs.length;
        for(int i=0;i<n;i++)
        {
            char[] arr=strs[i].toCharArray();
          Arrays.sort(arr);
            String r= new String(arr);
            if(!map.containsKey(r))
            {
                List<String> val=new ArrayList<>();
                val.add(strs[i]);
                map.put(r,val);
            }
            else {
                List temp=map.get(r);
                temp.add(strs[i]);
                map.put(r,temp);
            }
        }
        for(String s:map.keySet())
            res.add(map.get(s));
        return res;


    }



}

