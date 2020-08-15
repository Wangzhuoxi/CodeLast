package jianzhioffer;

import java.util.ArrayList;
import java.util.Collections;

public class Code27AllStringOrder_RESEE {
    /**
     * abc   abc,acb,bac,bca,cab和cba。
     * @param str
     * @return
     */
    ArrayList<String>res=new ArrayList<>();
    public ArrayList<String> Permutation(String str) {
      return findStr(str,0,str.substring(1,str.length()));

    }
    ArrayList<String> findStr(String str,int i,String str2)
    {
        StringBuffer sb=new StringBuffer(str2);
        if(str2.length()==2)
        {
            res.add(str2);
            res.add(sb.reverse().toString());
            return res;
        }
       return res;

    }

}
