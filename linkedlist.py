"""
ListNode is a class representing a LinkedList data structure
@val - value stored in the node
@next - the next node in the list (i.e. the node the current node points to)
"""
class ListNode:
    def __init__(self, val = None, next = None):
        self.val = val #node value
        self.next = next #next node in the list

    def deleteNode(self, node):
        dummy = self
        prev = None
        nextNode = None
        index = 0
        if(self == node):
            self = self.next
        while(dummy.next.next and dummy.next != node):
            prev = dummy
            nextNode = dummy.next.next
            dummy = dummy.next
            
        if(dummy):
            prev.next = nextNode

#driver code
def main():
    head = ListNode(0)
    dummy = head
    for i in range(1,10):
        dummy.next = ListNode(i)
        dummy = dummy.next
       
    head.deleteNode(head.next)
    while(head):
        print(head.val)
        head = head.next

#execute driver
main()
    
