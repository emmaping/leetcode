import javax.swing.tree.TreeNode;

public class Solution
{
  public boolean isSymmetric(TreeNode root)
  {
    if (root == null)
      return true;
    return checkSymmtric(root.left, root.right);

  }

  public boolean checkSymmtric(TreeNode leftNode, TreeNode rightNode)
  {
    if (leftNode == null && rightNode == null)
      return true;
    if (leftNode == null ^ rightNode == null || leftNode.val != rightNode.val)
      return false;
    return checkSymmtric(leftNode.left, rightNode.right) && checkSymmtric(leftNode.right, rightNode.left);
  }
}
