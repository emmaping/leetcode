import javax.swing.tree.TreeNode;

public class Solution
{
  public boolean isBalanced(TreeNode root)
  {
    if (root == null)
    {
      return true;
    }
    int left = depth(root.left);
    int right = depth(root.right);

    return Math.abs(left - right) < 2 && isBalanced(root.left) && isBalanced(root.right);

  }

  public int depth(TreeNode root)
  {
    if (root == null)
    {
      return 0;
    }
    else
    {
      return (Math.max(depth(root.left), depth(root.right)) + 1);
    }

  }
}
