package testTwice;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class MinNum {
    public String PrintMinNumber(int[] numbers) {
        if (numbers == null || numbers.length == 0) {
            return "";
        }
        TreeSet<String> set=new TreeSet<String>(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return (o1+o2).compareTo(o2+o1)>0?1:-1;
            }
        });
        for (int i = 0; i < numbers.length; i++)
            set.add(String.valueOf(numbers[i]));
        StringBuffer sb = new StringBuffer();
        for (String s : set)
            sb.append(s);
        return sb.toString();
    }
}
