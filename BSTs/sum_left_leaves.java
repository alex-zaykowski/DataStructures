/**
 * Fast solution for me right now (took me around 5 minutes which was just
 * how long it took to think of the solution + write it because of Java's verbosity)
 * 
 * It's faster than 100% of solutions and takes up less space than 84% which is probably just
 * because of my isLeaf subroutine 
 * 
 * Overall I'm satisfied although this was a very easy question
 */
class Solution {
    public int sumOfLeftLeaves(TreeNode root) {
        Stack<TreeNode> tree = new Stack<TreeNode>();
        tree.add(root);
        int sum = 0;
        while(!tree.isEmpty()){
            TreeNode node = tree.pop();
            if(node.left != null && isLeaf(node.left)){
                sum+= node.left.val;
            }
            if(node.right != null){
                tree.add(node.right);
            }
            if(node.left != null){
                tree.add(node.left);
            }
        }
        return sum;
    }
    private boolean isLeaf(TreeNode n){
        if(n.left == null && n.right == null){
            return true;
        }else{
            return false;
        }
    }
}