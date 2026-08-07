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
    public ListNode deleteDuplicates(ListNode head) {

        ListNode dummy = head;
        while (dummy != null) {
            ListNode tail = dummy.next;
            while (tail != null) {
                if (dummy.val == tail.val) {
                    dummy.next = dummy.next.next;
                }
                tail = tail.next;
            }
            dummy = dummy.next;
        }

        return head;
    }
}
