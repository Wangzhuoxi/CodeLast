package jianzhioffer;

public class Code25CopyCompleteList_RESEE {
    public class RandomListNode {
        int label;
        RandomListNode next = null;
        RandomListNode random = null;

        RandomListNode(int label) {
            this.label = label;
        }
    }

    public RandomListNode Clone(RandomListNode pHead) {
        //对每一个节点先复制出来
        //再连接random

        RandomListNode p=pHead;
        while(p!=null) {
            RandomListNode node = new RandomListNode(p.label);
            node.next =p.next;
            p.next=node;
            p=node.next;
        }
        p=pHead;
        //此时注意连接的是random的下一个节点
        while(p!=null) {
            if(p.random!=null)
            p.next.random = p.random.next;
            p=p.next.next;
        }
        //断开：这时注意：每一个都要断开 ace  bd
        RandomListNode cur=pHead;
      p=pHead.next;
        while(cur.next!=null)
        {RandomListNode temp=cur.next;
        cur.next=temp.next;
        cur=temp;

  }
        return p;
    }
    }

