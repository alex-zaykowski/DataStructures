"""
This is another relatively suboptimal solution but I completed it on my first try
very quickly (aroudn 5 minutes if that) and it's faster than 61% of python solutions
although the memory usage is abismal I feel that this is a very straight forward solution
and the memory/speed improvements are trival, I may come back to it.
"""
class Solution(object):
    def invertTree(self, root):
        """
        :type root: TreeNode
        :rtype: TreeNode
        """
        self.invert(root)
        return root
    
    def invert(self, root):
        if(root == None):
            return root
        left = root.left
        right = root.right
        
        root.left = right
        root.right = left
        
        self.invert(left)
        self.invert(right)