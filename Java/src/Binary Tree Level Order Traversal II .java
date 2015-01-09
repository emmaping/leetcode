import java.util.ArrayList;

import javax.swing.tree.TreeNode;

public class Solution
{
  public List<List<Integer>> levelOrderBottom(TreeNode root)
  {
    List<List<Integer>> ret = new ArrayList<List<Integer>>();
    helper(root, 1, ret);
    Collections.reverse(ret);
    return ret;
  }

  public void helper(TreeNode root, int level, List<List<Integer>> ret)
  {
    if (root == null)
    {
      return;
    }

    if (ret.size() < level)
    {
      ArrayList<Integer> item = new ArrayList<Integer>();
      item.add(root.val);
      ret.add(item);
    }
    else
    {
      ret.get(level - 1).add(root.val);
    }

    helper(root.left, level + 1, ret);
    helper(root.right, level + 1, ret);
  }
}
