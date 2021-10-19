"""
ListNode is a class representing a LinkedList data structure
@val - value stored in the node
@next - the next node in the list (i.e. the node the current node points to)
"""
class ListNode:
    def __init__(self, val = None, next = None):
        self.val = val #node value
        self.next = next #next node in the list

#driver code
def main():
    head = ListNode("bob")
    dummy = head
    for i in range(10):
        dummy.next = ListNode(i)
        dummy = dummy.next
        
    while head.next:
        print(head.val)
        head = head.next

#execute driver
main()
    
