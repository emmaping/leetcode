/**
 * Definition for binary tree
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; left = null; right = null; }
 * }
 */
public class Solution {
    public List<TreeNode> generateTrees(int n) {
        return helper(1,n);
    }
    public List<TreeNode> helper(int left, int right){
        List<TreeNode> ret = new ArrayList<>();
        
        if (left == right){
            ret.add(new TreeNode(left));
            return ret;
        } 
        if (left > right) {
            ret.add(null);
            return ret;
        }
        
        for (int i = left; i<= right; i++){
            List<TreeNode> lefttree = helper(left, i-1);
            List<TreeNode> righttree = helper(i+1, right);
            
            for(TreeNode l: lefttree){
                for(TreeNode r: righttree){
                    TreeNode node = new TreeNode(i);
                    node.left = l;
                    node.right = r;
                    ret.add(node);
                }
            }
        }
        return ret;
    }
}