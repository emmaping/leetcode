import java.util.LinkedList;

class MinStack
{
  private int min = Integer.MAX_VALUE;
  private List<Integer> stack = new LinkedList<>();

  public void push(int x)
  {
    stack.add(x);
    if (x < min)
    {
      min = x;
    }
  }

  public void pop()
  {
    int top = stack.remove(stack.size() - 1);
    if (top == min)
    {
      if (stack.size() != 0)
      {
        min = Collections.min(stack);
      }
      else
      {
        min = Integer.MAX_VALUE;
      }
    }
  }

  public int top()
  {
    return stack.get(stack.size() - 1);
  }

  public int getMin()
  {
    return min;
  }
}
