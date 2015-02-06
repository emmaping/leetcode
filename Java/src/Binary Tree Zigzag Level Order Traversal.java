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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {

        int level = 0;
        
        List<List<Integer>> ret = new ArrayList<>();
        
        helper(root, level, ret);
        return ret;
    }
    
    private void helper(TreeNode root, int level, List<List<Integer>> ret){
        if (root == null) return;
        if (level >= ret.size()){
            List<Integer> newLevel = new ArrayList<>();
            ret.add(newLevel);
            
        } 
        if (level % 2 != 0){
            ret.get(level).add(root.val);
        } 
        else{
            ret.get(level).add(0, root.val);
        }
        helper(root.right, level+1, ret);
        helper(root.left, level+1, ret);
    }
}