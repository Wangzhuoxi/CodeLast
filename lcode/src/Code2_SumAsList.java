public class Code2_SumAsList {
    public static class ListNode {
     int val;
      ListNode next;
      ListNode(int x) { val = x; }
    }
    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
      int pre=0;
      ListNode res=new ListNode(0);
      ListNode cur;
      cur=res;
       while (l1!=null||l2!=null||pre!=0)
       {
           int val1=l1!=null?l1.val:0;
           int val2=l2!=null?l2.val:0;
           int val=(val1+val2+pre)%10;
           pre=(val1+val2+pre)/10;
           ListNode temp=new ListNode(val);
           cur.next=temp;
           cur=cur.next;
           if(l1 != null) l1 = l1.next;
           if(l2 != null) l2 = l2.next;
       }

       return res.next;
    }
    public static void main(String[] args) {
        ListNode temp1=new ListNode(2);
        ListNode l1=temp1;
        l1.next=new ListNode(4);
        l1=l1.next;
        l1.next=new ListNode(3);
        l1=l1.next;
        l1.next=null;

        ListNode temp2=new ListNode(5);
        ListNode l2=temp2;
        l2.next=new ListNode(6);
        l2=l2.next;
        l2.next=new ListNode(4);
        l2=l2.next;
        l2.next=null;
ListNode temp3=addTwoNumbers(temp1,temp2);
        while(temp3!=null)
        {
            System.out.println(temp3.val);
           temp3=temp3.next;
        }
    }
}
