package BFS;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;

/*
你有一个带有四个圆形拨轮的转盘锁。每个拨轮都有10个数字： '0', '1', '2', '3', '4', '5', '6', '7', '8', '9' 。每个拨轮可以自由旋转：例如把 '9' 变为  '0'，'0' 变为 '9' 。每次旋转都只能旋转一个拨轮的一位数字。

锁的初始数字为 '0000' ，一个代表四个拨轮的数字的字符串。

列表 deadends 包含了一组死亡数字，一旦拨轮的数字和列表里的任何一个元素相同，这个锁将会被永久锁定，无法再被旋转。

字符串 target 代表可以解锁的数字，你需要给出最小的旋转次数，如果无论如何不能解锁，返回 -1。
 */
public class OpenRotateLock {
    public String plusOne(String s,int i){
        char[] temp=s.toCharArray();
        if(temp[i]=='9')
            temp[i]='0';
        else
            temp[i]+=1;
        return new String(temp);
    }
    public String minOne(String s,int i){
        char[] temp=s.toCharArray();
        if(temp[i]=='0')
            temp[i]='9';
        else
            temp[i]-=1;
        return new String(temp);
    }
    public int openLock(String[] deadends, String target) {
        Queue<String> queue=new LinkedList<>();
        Set<String> visited=new HashSet<>();
        queue.add("0000");
        visited.add("0000");
        int res=0;
        Set<String> deads=new HashSet<>();
        for(String s :deadends){
            deads.add(s);
        }

        while(!queue.isEmpty()) {
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                String temp = queue.poll();
                if (deads.contains(temp))
                    continue;
                if (temp.equals(target))
                    return res;
                for (int j = 0; j < 4; j++) {
                    String a = plusOne(temp, j);
                    String b = minOne(temp, j);
                    if (!visited.contains(a)) {
                        queue.offer(a);
                        visited.add(a);
                    }
                    if (!visited.contains(b)) {
                        queue.offer(b);
                        visited.add(b);
                    }
                }
            }
            res++;
        }
return -1;
    }
}
