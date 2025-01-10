/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode mergeTwoLists(ListNode head1, ListNode head2) {
        // Dummy node to simplify edge cases
        ListNode dummy = new ListNode(-1);
        ListNode tail = dummy;

        // Merge both lists while both have elements
        while (head1 != null && head2 != null) {
            if (head1.val < head2.val) {
                tail.next = head1;
                head1 = head1.next;
            } else {
                tail.next = head2;
                head2 = head2.next;
            }
            tail = tail.next;
        }

        // Append the remaining nodes of either list
        if (head1 != null) {
            tail.next = head1;
        } else if (head2 != null) {
            tail.next = head2;
        }

        // The merged list starts at dummy.next
        return dummy.next;
    }
}


/*class Solution {
    public ListNode mergeTwoLists(ListNode head1, ListNode head2) {

    ListNode ans=null;
    ListNode h3=ans;
    ListNode tail=ans;


    while(head1 !=null && head2 !=null) {
        if(head1.val<head2.val) {
            ans=new ListNode(head1.val);
            head1=head1.next;
            tail.next=ans;
            tail=ans;
        }
        else {
            ans=new ListNode(head2.val);
            head2=head2.next;
            tail.next=ans;
            tail=ans;
        }
    }
    return h3;
    }
}*/