/**
 * Very slow O(n) solution, but done within 10 minues by myself with no help
 * 
 * I will add a better solution at the bottom
 */
class Solution {
    public ListNode removeElements(ListNode head, int val) {
        ListNode dummy = head;
        ListNode prev = null;
        while(dummy != null){
            if(dummy.val == val){
                if(prev != null){
                    prev.next = dummy.next; 
                }else{
                    head = head.next;
                }
            }else{
                prev = dummy;
            }
            dummy = dummy.next;
        }
        return head;
    }
}
/**
 * The minor change of using 3 nodes instead of two (and therefore not having
 * the null check) makes it run considerably faster (beating 74%) and takes up slightly 
 * less space (beating only 13%)
 */
class Solution2{
    public ListNode removeElements(ListNode head, int val) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode cur = dummy;

        while(cur.next != null) {
            if(cur.next.val == val) {
                cur.next = cur.next.next;
            }
            else
                cur = cur.next;
        }
        return dummy.next;
    }
}