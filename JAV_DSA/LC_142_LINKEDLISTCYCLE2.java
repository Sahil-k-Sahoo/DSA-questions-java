
public class Solution {
    public ListNode detectCycle(ListNode head) {
         ListNode p=head;
         ListNode t=head;
        while (p!=null&&p.next!=null){
            t=t.next;
            p=p.next.next;
            if (t==p){
                ListNode x=head;
                 while (x!=t){
                x=x.next;
                t=t.next;
            }
            return x;
            }
        }
        return null;
    }
}