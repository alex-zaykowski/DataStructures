/**
 * This is my first solution, my brain has been foggy so I got 90% of the way to a 
 * solution but gave up because clearly I was missing something.
 * 
 * This is the most simplistic version and made sense even though it's an awful soltuion,
 * I am going to come back to this one.
 */
class Solution {
    public boolean hasPathSum(TreeNode root, int targetSum) {
        if(root == null){
            return false;
        }
        Stack<TreeNode> stack = new Stack<TreeNode>();
        Stack<Integer> sumStack = new Stack<Integer>();
        stack.push(root);
        sumStack.push(targetSum - root.val);
        
        while(!stack.isEmpty()){
            TreeNode node = stack.pop();
            int value = sumStack.pop();
            
            if(isLeaf(node) && value == 0){
                return true;
            }
            
            if(node.right != null){
                stack.push(node.right);
                sumStack.push(value - node.right.val);
            }
            if(node.left != null){
                stack.push(node.left);
                sumStack.push(value - node.left.val);
            }
        }
        return false;
    }
    
    private boolean isLeaf(TreeNode node){
        if(node.left == null && node.right == null){
            return true;
        }else{
            return false;
        }
    }
}