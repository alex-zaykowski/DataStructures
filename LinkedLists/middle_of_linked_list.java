/**
 * Memory storage is high (only beating 4%) but runs faster than 100% of java
 * solutions, again this solution was found in around 5 minutes
 */
class Solution {
    public ListNode middleNode(ListNode head) {
        ListNode dummy = head;
        int mid = 0;
        while(dummy != null){
            mid += 1;
            dummy = dummy.next;
        }
        mid = mid / 2;
        for(int i = 0; i < mid; i++){
            head = head.next;
        }
        return head;
    }
}