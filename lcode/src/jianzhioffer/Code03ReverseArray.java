package jianzhioffer;

import java.util.ArrayList;
import java.util.Collections;

public class Code03ReverseArray {
    public class ListNode {
        int val;
        ListNode next = null;

        ListNode(int val) {
            this.val = val;
        }
    }
    public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
        ArrayList<Integer> list=new ArrayList<>();
        ListNode cur=listNode;
        while(cur!=null)
        {
            list.add(cur.val);
            cur=cur.next;
        }
        Collections.reverse(list);
return list;
    }
}
