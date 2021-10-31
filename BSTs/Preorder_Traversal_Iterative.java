/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
import java.util.*;
class Solution {
    private List<Integer> vals = new ArrayList<Integer>();
    private Stack<TreeNode> nodes = new Stack<TreeNode>();
    public List<Integer> preorderTraversal(TreeNode root) {
        if(root == null){
            return vals;
        }
        nodes.add(root);
        while(!nodes.isEmpty()){
            TreeNode node = nodes.pop();
            vals.add(node.val);
            if(node.right != null){
                nodes.push(node.right);
            }
            if(node.left != null){
                nodes.push(node.left);
            }
        }
        return vals;
    } 
}