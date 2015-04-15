import javax.swing.tree.TreeNode;

public class Solution
{
  int value;

  public int maxPathSum(TreeNode root)
  {
    value = Integer.MIN_VALUE;
    helper(root);
    return value;
  }

  private int helper(TreeNode node)
  {
    if (node == null)
      return 0;
    int left = Math.max(0, helper(node.left));
    int right = Math.max(0, helper(node.right));
    value = Math.max(value, left + right + node.val);
    return Math.max(left, right) + node.val;
  }
}
