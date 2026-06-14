class Solution {
   public ListNode removeNthFromEnd(ListNode head, int n) {

    ListNode d=new ListNode(0);
    d.next=head;
    ListNode t=d;
    ListNode p=d;
    for (int i = 0;i<=n;i++) {
        t = t.next;
    }
    while (t != null) {
        t = t.next;
        p = p.next;
    }
    p.next = p.next.next;
    return d.next;
}
}