public class Solution
{
  public int sqrt(int x)
  {
    if (x == 0 || x == 1)
      return x;
    int left = 1;
    int right = x;
    int ans = 0;

    while (left <= right)
    {
      int mid = (left + right) / 2;
      if (mid < x / mid)
      {
        left = mid + 1;
        ans = mid;
      }
      else if (mid > x / mid)
      {
        right = mid - 1;

      }
      else
      {
        return mid;
      }
    }
    return ans;
  }
}
