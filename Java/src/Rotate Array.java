public class Solution
{
  public void rotate(int[] nums, int k)
  {
    int n = nums.length;
    while ((k %= n) > 0 && n > 1)
    {
      int range = n - k;
      for (int i = 1; i <= range; i++)
      {
        int temp = nums[n - i];
        nums[n - i] = nums[n - i - k];
        nums[n - i - k] = temp;
      }
      n = k;
      k = n - (range % k);
    }
  }
}
