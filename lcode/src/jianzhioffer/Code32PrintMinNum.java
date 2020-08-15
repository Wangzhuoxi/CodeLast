package jianzhioffer;


import java.util.Comparator;
import java.util.TreeSet;

public class Code32PrintMinNum {
    //Compatator这是说如果o1的id - o2的id是正数就升序，如果负数降序。如果0就剔除
    //用TreeSet，是有序的集合
    public String PrintMinNumber(int [] numbers) {
TreeSet<String> set=new TreeSet<>(new Comparator<String>() {
    @Override
    public int compare(String o1, String o2) {
        return (o1+o2).compareTo(o2+o1)>0?1:-1;
    }
});
  for(int i=0;i<numbers.length;i++)
            set.add(String.valueOf(numbers[i]));
        StringBuffer sb=new StringBuffer();
        for(String s:set)
            sb.append(s);
        return sb.toString();
       }
    }

