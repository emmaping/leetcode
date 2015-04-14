import java.util.Stack;

public class Solution
{
  public int largestRectangleArea(int[] height)
  {
    int length = height.length;
    Stack<Integer> stack = new Stack<>();
    int ret = 0;
    int hi;
    int s;

    for (int i = 0; i <= length; i++)
    {
      if (i == length)
      {
        hi = 0;
      }
      else
      {
        hi = height[i];
      }
      while (!stack.isEmpty() && height[stack.peek()] >= hi)
      {
        int h = height[stack.pop()];
        if (!stack.isEmpty())
        {
          s = stack.peek();
        }
        else
        {
          s = -1;
        }
        ret = Math.max(ret, h * (i - s - 1));
      }
      stack.push(i);
    }
    return ret;
  }
}
