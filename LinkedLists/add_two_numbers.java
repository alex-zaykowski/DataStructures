/**
 * Rudimentary solution to the add two numbers problem on leetcode
 * it still has a decent time being 72% faster than submited java solutions
 * and using 39.2MB less memory than 66.9% of java solutions
 * 
 * I plan on refining this more
 */
public class add_two_numbers {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode result = new ListNode();
        ListNode end = result;
        int carry = 0;
        while(l1 != null || l2 != null){
            int val1 = l1 != null ? l1.val : 0; 
            int val2 = l2 != null ? l2.val : 0; 
            int sum = val1 + val2 + carry;
            if(sum > 9){
                carry = 1;
                result.val = (sum % 10);
            }else{
                result.val = (sum);
                carry = 0;
            }
            if(l1 != null){
                l1 = l1.next;
            }
            if(l2 != null){
                l2 = l2.next;
            }
            
            if(l1 != null || l2 != null){
                result.next = new ListNode();
                result = result.next;
            }
        }
        if(carry == 1){
            result.next = new ListNode(1);
        }
        return end;
    }
}
