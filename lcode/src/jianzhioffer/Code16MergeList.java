package jianzhioffer;

public class Code16MergeList {
    public class ListNode {
        int val;
        ListNode next = null;

        ListNode(int val) {
            this.val = val;
        }
    }
    public ListNode Merge(ListNode list1,ListNode list2) {

ListNode cur1=list1.val<=list2.val?list1:list2;
ListNode cur2=cur1==list1?list2:list1;
ListNode pre=cur1;
while(cur1!=null&&cur2!=null)
{
    if(cur1.val<=cur2.val) {
        pre=cur1;
        cur1 = cur1.next;
    }
    else
    {
        ListNode move=cur2;
        cur2=cur2.next;
        move.next=cur1;
        pre.next=move;
        pre=move;
    }


}
        if(cur1==null)
            pre.next=cur2;
return list1;
    }
}
