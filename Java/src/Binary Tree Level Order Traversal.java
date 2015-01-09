/**
 * Definition for binary tree
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> ret = new ArrayList<List<Integer>>();
        helper(root, 1 , ret);
        return ret;
    }
    
    public void helper(TreeNode root, int level, List<List<Integer>> ret){
        if (root == null) {
            return;
        }
        
        if (ret.size() < level){
            ArrayList<Integer> item = new ArrayList<Integer>();
            item.add(root.val);
            ret.add(item);
        }
        else{
            ret.get(level-1).add(root.val);
        }
        
        helper(root.left, level+1, ret);
        helper(root.right, level+1, ret);
    }
}