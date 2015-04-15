import java.util.Arrays;

public class Solution
{
  public int longestConsecutive(int[] num)
  {
    Arrays.sort(num);
    if (num.length == 1)
    {
      return 1;
    }
    int ret = 0;
    int cur = 0;
    for (int i = 1; i < num.length; i++)
    {
      if (num[i] == num[i - 1] + 1)
      {
        cur++;
      }
      else if (num[i] == num[i - 1])
      {
        continue;
      }
      else
      {
        ret = Math.max(ret, cur + 1);
        cur = 0;
      }
    }
    return Math.max(ret, cur + 1);
  }
}
