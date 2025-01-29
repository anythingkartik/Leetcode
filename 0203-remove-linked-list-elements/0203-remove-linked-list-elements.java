class Solution {
    public ListNode removeElements(ListNode head, int val) {
        if (head == null) {
            return head;
        }

        // Remove leading nodes with the given value
        while (head != null && head.val == val) {
            head = head.next;
        }

        ListNode temp = head;

        // Traverse the list and remove elements
        while (temp != null && temp.next != null) { // Ensure temp.next is not null
            if (temp.next.val == val) {
                temp.next = temp.next.next; // Skip the node
            } else {
                temp = temp.next; // Move forward only if no deletion
            }
        }

        return head; // Return the modified list
    }
}
