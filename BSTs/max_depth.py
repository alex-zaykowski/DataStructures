# Definition for a binary tree node.
# class TreeNode(object):
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution(object):
    def maxDepth(self, root):
        if(root == None):
            return 0
        else:
            return 1 + max(self.maxDepth(root.left), self.maxDepth(root.right))

"""
So how does this work? 

Solving this problem recursively means first defining the base case, which that 
our node does not exist (i.e. is None), thus returning 0

Python, unlike Java does not require the return type of a function to be defined, 
it is helpful to understand that we are returning an int (this will come into play
as the recursion wraps up)

If our node (root) is not None, then we add 1 + the larger depth (either the left or right
subtree)

This will keep opening up recursive cases until we finally hit the base case of a subtree 
(where we return 0) and we can close out each open recursive case (0 + 1 + 1 + 1 + 1) 
until we get our final depth
"""