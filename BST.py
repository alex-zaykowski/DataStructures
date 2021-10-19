"""
TreeNode is a class to represent a basic Binary Search Tree structure.
By default the values are set to none, however the constructor can take
arguments to create a full tree in one declaration.

@value - value the node contains
@left - left child
@right - right child
"""
class TreeNode:
    def __init__(self, value = None, left = None, right = None):
        self.value = value
        self.left = left
        self.right = right

"""
Prints a preorder traversal of the tree
1. visit the root
2. Traverse the left subtree
3. Traverse the right subtree
"""
def PreorderTraversal(node):
    if(node):
        print(node.value)
        PreorderTraversal(node.left)
        PreorderTraversal(node.right)
        
"""
Prints a inorder traversal of the tree
1. Traverse the left subtree
2. Visit the root node
3. Traverse the right subtree
"""
def InOrderTraversal(node):
    if(node):
        InOrderTraversal(node.left)
        print(node.value)
        InOrderTraversal(node.right)
        
"""
Prints a postorder traversal of the tree
1. Traverse the left subtree
2. Traverse the right subtree
3. Visit the root node
"""   
def PostOrderTraversal(node):
    if(node):
        PostOrderTraversal(node.left)
        PostOrderTraversal(node.right)
        print(node.value)

#Driver function
def main():
    """
    Create the tree:
         0
        / \
       1   2
      / \
     4   5
    """
    tree = TreeNode(0,TreeNode(1), TreeNode(2))
    tree.left.left = TreeNode(4)
    tree.left.right = TreeNode(5)

    print("==== PRE-ORDER ====")
    PreorderTraversal(tree)
    print("\n==== IN-ORDER ====")
    InOrderTraversal(tree)
    print("\n==== POST-ORDER ====")
    PostOrderTraversal(tree)
          
#Run driver function    
main()
            
