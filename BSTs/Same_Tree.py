"""
Again this was a quick solution to the problem. The goal was to check to see if two BSTs
contained the exact same structure and values. 

The memory useage is abismal (only better than 14%) but the runtime is very good
(better than 80% of solutions)

I'm going to come back to this to improve it, it was very obvious while writing it
that it was a bit to lengthy, I know where I can improve it but I want to solve some
others first.
"""
class Solution(object):
    def isSameTree(self, p, q):
        """
        :type p: TreeNode
        :type q: TreeNode
        :rtype: bool
        """
        if(p is None and q is None):
            return True
        elif(p is None or q is None):
            return False
        
        pList = [p]
        qList = [q]
        sameTree = True
        while(pList and qList):
            node1 = pList.pop()
            node2 = qList.pop()
            if(node1.val != node2.val):
                sameTree = False
                break
            
            if(node1.right != None and node2.right != None):
                pList.append(node1.right)
                qList.append(node2.right)
            else:
                if(node1.right != None or node2.right != None):
                    sameTree = False
                    break

            if(node1.left != None and node2.left != None):
                pList.append(node1.left)
                qList.append(node2.left)
            else:
                if(node1.left != None or node2.left != None):
                    sameTree = False
                    break

        return sameTree
