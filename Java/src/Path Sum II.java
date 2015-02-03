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
    public List<List<Integer>> pathSum(TreeNode root, int sum) {
        List<List<Integer>> ret = new ArrayList<>(); 
        List<Integer> stack = new ArrayList<>(); 
        if (root == null) return ret;
        
        pathStack(root, sum, stack, ret);
        return ret;
        
    }
        
    private void pathStack(TreeNode root, int sum, List<Integer> stack, List<List<Integer>> ret){
        stack.add(root.val);
        sum -= root.val;
        
        if(root.right != null){
            pathStack(root.right, sum, new ArrayList<>(stack), ret);
        }
        
        if(root.left != null){
            pathStack(root.left, sum, new ArrayList<>(stack), ret);
        }
        
        if(root.left == null && root.right == null && sum == 0){
            ret.add(stack);
        }
    }
}