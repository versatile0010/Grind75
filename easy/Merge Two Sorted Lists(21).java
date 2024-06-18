/*
  - Use a two pointer approach (runners)
    - One pointer will be inside `list1`, another pointer will be inside `list2`
    - In each of the iteration,
        - comparing the node values a the current pointers.
        - We will retreieve the node with a smaller value to be appended to merged sorted list(answer)

Time Complexity
: O(m + n), where m,n are the length of the linkedlists.

Space Complexity
: O(1) 

*/



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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode head = new ListNode();
        ListNode cur = head;
        while(list1 != null || list2 != null){
            if(list2 == null || (list1 != null && list1.val < list2.val)){
                cur.next = list1;
                cur = list1;
                list1 = list1.next;
            } else {
                cur.next = list2;
                cur = list2;
                list2 = list2.next;
            }
        }
        return head.next;
    }
}
