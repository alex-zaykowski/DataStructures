"""
Produce the following equation a + (b - c) * d

From the tree:

       +
      / \
     a   *
        / \
       -   d
      / \
     b   c
"""
class TreeNode:
    def __init__(self, value = None, left = None, right = None):
        self.value = value
        self.left = left
        self.right = right

def FullyParameterized(node):
    if(node):
        FullyParameterized(node.left)
        if(node.left == None and node.right == None):
            print("(", end="")
        print(node.value, end="")
        FullyParameterized(node.right)
        if(node.left == None and node.right == None):
            print(")", end="")

def ArithmaticParameterized(node):
    if(node):
        ArithmaticParameterized(node.left)
        if(node.left == None and node.right == None):
            print("(", end="")
        print(node.value, end="")
        ArithmaticParameterized(node.right)
        if(node.left == None and node.right == None):
            print(")", end="")

#Driver function
def main():
    root = TreeNode("+")
    root.left = TreeNode("a")
    root.right = TreeNode("*")

    root.right.left = TreeNode("-")
    root.right.right = TreeNode("d")

    root.right.left.left = TreeNode("b")
    root.right.left.right = TreeNode("c")

    ArithmaticParameterized(root)

main()
    
