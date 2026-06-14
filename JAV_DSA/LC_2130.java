class Solution{
    public int pairSum(ListNode head){
        ListNode s=head;
        ListNode f=head;
        while(f!=null&&f.next!=null){
            s=s.next;
            f=f.next.next;
        }
        ListNode prev=null;
        while(s!=null){
            ListNode next=s.next;
            s.next=prev;
            prev=s;
            s=next;
        }
        int ans=0;
        while(prev!=null){
            ans=Math.max(ans,head.val+prev.val);
            head=head.next;
            prev=prev.next;
        }
        return ans;
    }
}