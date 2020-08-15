package jianzhioffer;

/**
 * 找到中序遍历结果的下一个节点
 * 思路：1.当有右孩子时，右孩子的最左是下一个，当没有右孩子时，从当前节点
 * 开始向上找，如果当前节点是其父节点的左孩子，返回该父节点。
 */
public class Code55Getnext_RESEE {
    public class TreeLinkNode {
        int val;
        TreeLinkNode left = null;
        TreeLinkNode right = null;
        TreeLinkNode next = null;

        TreeLinkNode(int val) {
            this.val = val;
        }
    }

        public TreeLinkNode GetNext(TreeLinkNode pNode)
        {
            TreeLinkNode temp=pNode;
            if(pNode.right!=null)
            {
                temp=pNode.right;
                while (temp.left!=null)
                    temp=temp.left;
                return temp;
            }
            //右子树为空。
            else
            {
                while(temp!=null&&temp.next!=null)
                {
                    if(temp.next.left==temp)
                       return temp;
                    else {
                        temp = temp.next;
                    }
                }
                if(temp.next==null)
                    return null;

            }
return null;

        }
}
