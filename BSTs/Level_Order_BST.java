/**
 * This is a decent answer, a medium level soltuion, beating 67% in speed and 54% in space
 * I did this without any help just reviewing the BFS algorithm, will definietly come back
 * to it
 */
import java.util.*;
class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        Queue<TreeNode> level = new LinkedList<TreeNode>();
        
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        if(root == null){
            return result;
        }
        
        queue.add(root);
        List<Integer> values = new ArrayList<Integer>();
        while(!queue.isEmpty()){
            TreeNode node = queue.poll();
            values.add(node.val);
            if(node.left != null){
                level.add(node.left);
            }
            if(node.right != null){
                level.add(node.right);
            }
            
            if(queue.size() == 0){
                result.add(values);
                queue.addAll(level);
                level.clear();
                values = new ArrayList<Integer>();
            }
        }
        
        return result;
    }
}