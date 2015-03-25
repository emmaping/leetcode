public class Solution
{
  public int trap(int[] A)
  {
    int left = 0;
    int right = A.length - 1;
    int ret = 0;
    int leftMax = 0;
    int rightMax = 0;

    while (left <= right)
    {
      leftMax = Math.max(leftMax, A[left]);
      rightMax = Math.max(rightMax, A[right]);
      if (leftMax < rightMax)
      {
        ret += (leftMax - A[left]);
        left++;
      }
      else
      {
        ret += (rightMax - A[right]);
        right--;
      }
    }
    return ret;

  }
}
