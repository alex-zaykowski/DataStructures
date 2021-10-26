# Definition for singly-linked list.
# class ListNode(object):
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class ListNode:
    def __init__(self, val=0, next = None):
        self.val = val
        self.next = next

def isPalindrome(head):
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
