public class Solution
{
  public int findPeakElement(int[] num)
  {
    int start = 0;
    int end = num.length - 1;

    while (start < end)
    {
      int midleft = (start + end) / 2;
      int midright = midleft + 1;
      if (num[midleft] < num[midright])
      {
        start = midright;
      }
      else
      {
        end = midleft;
      }
    }
    return start;
  }
}
