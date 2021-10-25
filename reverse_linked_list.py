# Definition for singly-linked list.
# class ListNode(object):
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution(object):
    def isPalindrome(self, head):
        """
        :type head: ListNode
        :rtype: bool
        """
        stack = []
        dummy = head
        isPalindrome = True
        while(dummy):
            stack.append(dummy.val)
            dummy = dummy.next
        while(stack):
            value = stack.pop()
            if(value != head.val):
                isPalindrome = False
                break
            else:
                head = head.next
        return isPalindrome
