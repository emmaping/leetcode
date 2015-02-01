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
    public int sumNumbers(TreeNode root) {
        if(root == null) return 0;
        if (root.left == null && root.right == null) return root.val;
        
        int val = 0;
        if (root.left != null){
            root.left.val += root.val * 10;
            val += sumNumbers(root.left);
            root.left.val -= root.val * 10;
        }
        if (root.right != null){
            root.right.val += root.val * 10;
            val += sumNumbers(root.right);
            root.right.val -= root.val * 10;
        }
        return val;
    }
}