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
    public ListNode mergeNodes(ListNode head) {
        head = head.next;
        ListNode modify = head;

        while(modify != null) {
            ListNode nextSum = modify;
            int sum = 0;

            while(nextSum.val != 0) {
                sum += nextSum.val;
                nextSum = nextSum.next;
            }

            modify.val = sum;
            modify.next = nextSum.next;
            modify = modify.next;
        }

        return head;
    }
}