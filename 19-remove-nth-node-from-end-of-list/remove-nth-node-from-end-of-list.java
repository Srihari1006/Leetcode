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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head == null) return head;
        if(head.next == null && n == 1) return null;
        if(n == 1){
            ListNode curr = head;
            while(curr.next.next != null){
                curr = curr.next;
            }
            curr.next = null;
            return head;
        }
        ListNode s = head;
        ListNode f = head;
        for(int i = 1;i<=n-1;i++){
            f = f.next;
        }
        while(f.next != null){
            s = s.next;
            f = f.next;
        }
        s.val = s.next.val;
        s.next = s.next.next;
        return head;
    }
}