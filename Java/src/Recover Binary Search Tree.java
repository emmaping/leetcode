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

    TreeNode first = null;
    TreeNode sec = null;
    TreeNode prev = new TreeNode(Integer.MIN_VALUE);

    public void recoverTree(TreeNode root) {

        helper(root);

        int temp = first.val;
        first.val = sec.val;
        sec.val = temp;
    }

    private void helper(TreeNode root) {
        if (root == null)
            return;

        helper(root.left);

        if (first == null && prev.val >= root.val) {
            first = prev;
        }

        if (first != null && prev.val >= root.val) {
            sec = root;
        }
        
        prev = root;

        helper(root.right);
}
}