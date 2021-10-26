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
    revHead = head
    revHead = reverse(revHead)
    isPalindrome = True
    while(revHead and head):
        print(str(revHead.val) + "  " + str(head.val))
        if(revHead.val != head.val):
            isPalindrome = False
            break
        else:
            revHead = revHead.next
            head = head.next  
    return isPalindrome
    
def reverse(head):
    prev = None
    newHead = None
    while(head):
        newHead = head
        nextNode = head.next
        head.next = prev
        prev = head
        head = nextNode
    return newHead


def PrintList(node):
    while(node):
        print(node.val)
        node = node.next

def main():
    head = ListNode(1)
    head.next = ListNode(1)
    head.next.next = ListNode(2)
    head.next.next.next = ListNode(1)
    print(isPalindrome(head))
main()
