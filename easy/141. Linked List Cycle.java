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
        ListNode runner = head;
        while(runner != null && runner.next != null){
            head = head.next;
            runner = runner.next.next;
            if(head == runner){
                return true;
            }
        }
        return false;
    }
}
