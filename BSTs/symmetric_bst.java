/**
 * Basic recursive solution to check whether or not a bst is symmetrical
 * it is 0ms faster than 100% of solutions and uses 80% less memory. 
 * 
 * I first tries to solve this iteratively and I decided against it since 
 * I wanted to work on writing recursive boolean functions, it also seemed like
 * a recursive solution would be quicker (which it was)
 * 
 * I am satisfied with this solution although I may look into how to get the memory
 * usage down
 */
class Solution {
    public boolean isSymmetric(TreeNode root) {
        return sym(root.left, root.right);
    }
    private boolean sym(TreeNode left, TreeNode right){
        if(left == null && right == null){
            return true;
        }else if(left == null && right != null){
            return false;
        }else if(right == null && left != null){
            return false;
        }else if(left.val != right.val){
            return false;
        }else{
            return sym(left.left, right.right) && sym(left.right, right.left);
        }
    }
}