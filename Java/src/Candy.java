import java.util.Arrays;

public class Solution
{
  public int candy(int[] ratings)
  {
    int length = ratings.length;
    if (length <= 1)
      return length;

    int[] left = new int[length];
    int[] right = new int[length];

    Arrays.fill(left, 1);
    Arrays.fill(right, 1);

    for (int i = 0; i < length; i++)
    {
      int j = length - i - 1;
      if (ratings[i + 1] > ratings[i])
      {
        left[i + 1] = left[i] + 1;
      }
      if (ratings[j - 1] > ratings[j])
      {
        right[j - 1] = right[j] + 1;
      }
    }

    int ret = 0;
    for (int i = 0; i < ratings.length; i++)
    {
      ret += Math.max(left[i], right[i]);
    }
    return ret;

  }
}
