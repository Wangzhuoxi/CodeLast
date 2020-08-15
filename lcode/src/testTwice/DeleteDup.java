package testTwice;

/**
 * 112233 ->null 1223 ->13
 */
public class DeleteDup {
    public class ListNode {
        int val;
        ListNode next = null;

        ListNode(int val) {
            this.val = val;
        }
    }

//重复的要保留一个
        public ListNode deleteDuplicates(ListNode head) {
            if(head==null || head.next==null)return head;
            ListNode cur=head;
            while(cur!=null && cur.next!=null){
                if(cur.val==cur.next.val){
                    cur.next=cur.next.next;
                }else{
                    cur=cur.next;
                }
            }
            return head;
        }

//删除所有的重复节点
    public ListNode deleteDeplication(ListNode pHead){

        if (pHead == null)
            return null;

        //注意备用头结点，头结点可能被删除
        ListNode first = new ListNode(-1);

        first.next = pHead;
        ListNode p = pHead;
        //前节点
        ListNode preNode = first;

        while (p != null && p.next != null){

            if (p.val == p.next.val){ //两节点相等

                int val = p.val; //记录val用于判断后面节点是否重复
                while(p != null && p.val == val){   //这一步用于跳过相等的节点，用于删除
                    p = p.next;
                }
                preNode.next = p; //删除操作，前节点的next直接等于现在的节点，把中间的节点直接跨过
            }else {
                preNode = p;
                p = p.next;
            }
        }
        return first.next;
    }




}
