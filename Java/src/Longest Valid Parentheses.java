import java.util.ArrayList;
import java.util.List;

public class Solution
{
  public int longestValidParentheses(String s)
  {
    List<Integer> stack = new ArrayList<Integer>();
    int max = 0;
    int left = -1;
    for (int i = 0; i < s.length(); i++)
    {
      if (s.charAt(i) == '(')
        stack.add(i);
      else
      {
        if (stack.isEmpty())
          left = i;
        else
        {
          stack.remove(stack.size() - 1);
          if (stack.isEmpty())
            max = Math.max(max, i - left);
          else
            max = Math.max(max, i - stack.get(stack.size() - 1));
        }
      }
    }
    return max;
  }
}
