public class Solution {
    public boolean hasCycle(ListNode head) {
        ListNode p=head;
        ListNode t=head;
        while (p!=null&&p.next!=null){
            t=t.next;
            p=p.next.next;
            if (t==p){
                return true;
            }
        }
        return false;
    }
}