package jianzhioffer;

import java.util.ArrayList;
import java.util.LinkedList;

public class Code62GetMaxInWin {
    /**
     * 双向链表控制。保存的是第几个数。保证链表中一直是当前的最大值（链表最多不能超过三个数）
     *
     * @param num
     * @param size
     * @return
     */
    public ArrayList<Integer> maxInWindows(int[] num, int size) {

        LinkedList<Integer> list = new LinkedList<>();
        ArrayList<Integer> result = new ArrayList<>();
        if (num == null || size < 1 || num.length < size)
            return result;
        for (int i = 0; i < num.length; i++) {
            while (!list.isEmpty() && num[i] >= num[list.peekLast()])
                list.pollLast();
            list.add(i);
            //当list的第一个数字已经超过了固定的大小时
            if (list.peekFirst() == i - size)
                list.pollFirst();
            //考虑当第二个数时。
            if (i >= size - 1)
                result.add(num[list.peekFirst()]);


        }
        return result;

    }
}
