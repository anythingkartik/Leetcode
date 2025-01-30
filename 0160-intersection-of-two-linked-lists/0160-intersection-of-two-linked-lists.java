/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if (headA == null || headB == null) {
            return null; // If either list is null, there's no intersection.
        }

        // Step 1: Get the lengths of both lists
        ListNode tempA = headA;
        ListNode tempB = headB;
        int lengthA = 0, lengthB = 0;
        
        while (tempA != null) {
            lengthA++;
            tempA = tempA.next;
        }
        
        while (tempB != null) {
            lengthB++;
            tempB = tempB.next;
        }
        
        // Step 2: Align the start of both lists
        tempA = headA;
        tempB = headB;
        
        // Skip extra nodes in the longer list
        if (lengthA > lengthB) {
            for (int i = 0; i < lengthA - lengthB; i++) {
                tempA = tempA.next;
            }
        } else {
            for (int i = 0; i < lengthB - lengthA; i++) {
                tempB = tempB.next;
            }
        }
        
        // Step 3: Traverse both lists together and find the intersection
        while (tempA != null && tempB != null) {
            if (tempA == tempB) {
                return tempA; // Intersection found
            }
            tempA = tempA.next;
            tempB = tempB.next;
        }
        
        return null; // No intersection
    }
}

