public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode a = headA;
        ListNode b = headB;

        while (a != b){
            if (a!= null){
                a = a.next;
            }
            else{
                a = headB;
            }
           if (b!= null){
                b = b.next;
            }
            else{
                b = headA;
            }
        }
        return a;

    }
}