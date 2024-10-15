/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        ListNode fast=head;
        ListNode slow=head;

       

        while(fast!=null && fast.next!=null){
            fast=fast.next.next; //Put this before if condition
            slow=slow.next;
            if(slow==fast) {
                return true;
            }
        }
        return false;
    }
}