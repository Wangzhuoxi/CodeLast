public class IsPalindromeList {
    /**
     * 判断链表是不是回文形式。用递归。将链表进行后序遍历。与left比较
     */
    public class ListNode {
     int val;
     ListNode next;
 }
 ListNode left;
    public boolean isPalindrome(ListNode head){
        left=head;
        if(head==null)
            return true;
        return reverse(head);

    }
    public boolean reverse(ListNode right){
        if(right==null)
            return true;
        boolean res = reverse(right.next);
        res=res&&left.val==right.val;//之后的符合条件并且自己也符合条件
        left=left.next;
        return res;

    }
}
