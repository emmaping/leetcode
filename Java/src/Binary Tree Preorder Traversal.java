import java.util.LinkedList;

import javax.swing.tree.TreeNode;

/**
 * Definition for binary tree
 * public class TreeNode {
 * int val;
 * TreeNode left;
 * TreeNode right;
 * TreeNode(int x) { val = x; }
 * }
 */
public class Solution
{
  public List<Integer> preorderTraversal(TreeNode root)
  {
    List<Integer> result = new LinkedList<>();
    LinkedList<TreeNode> nodes = new LinkedList<>();

    if (root == null)
      return result;
    nodes.addLast(root);
    TreeNode node;
    while (nodes.size() > 0)
    {
      node = nodes.removeLast();
      result.add(node.val);
      if (node.right != null)
        nodes.addLast(node.right);
      if (node.left != null)
        nodes.addLast(node.left);
    }
    return result;
  }
}
