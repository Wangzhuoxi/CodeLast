public class GetNextNode {
    public class TreeLinkNode {
        int val;
        TreeLinkNode left = null;
        TreeLinkNode right = null;
        TreeLinkNode next = null;

        TreeLinkNode(int val) {
            this.val = val;
        }
    }

        public static TreeLinkNode GetNext(TreeLinkNode pNode)
        {

            if(pNode==null)
                return null;
            TreeLinkNode temp=null;
            if(pNode.right!=null)
            {
                temp=pNode.right;
                while(temp.left!=null)
                {
                    temp=temp.left;
                }
                return temp;
            }
            else
            {
                temp= pNode;
                while(temp.next!=null&&temp.next.left!=temp)
                {
                    temp=temp.next;
                }
                if(temp.next==null)
                return null;
                return temp.next;

            }

        }
}
