public class Solution
{
  public int maxArea(int[] height)
  {
    int i = 0;
    int j = height.length - 1;
    int maxium = 0;
    while (i < j)
    {
      maxium = Math.max(maxium, (j - i) * Math.min(height[i], height[j]));
      if (height[i] < height[j])
      {
        i++;
      }
      else
      {
        j--;
      }
    }
    return maxium;
  }
}
