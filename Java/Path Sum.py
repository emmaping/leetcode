public class Solution {
    public boolean hasPathSum(TreeNode root, int sum) {
        return helper(root, 0, sum);
    }

    private boolean helper(TreeNode root, int cur, int sum){
        if (root == null){
            return false;
        }
        cur = cur + root.val;
        if (root.left == null && root.right == null && cur==sum ){
            return true;
        }

        return helper(root.left, cur, sum) || helper(root.right, cur, sum);
    }
}