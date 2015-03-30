public class Solution
{
  public int search(int[] A, int target)
  {
    int right = A.length - 1;
    int left = 0;
    int mid;
    while (left <= right)
    {
      mid = (left + right) / 2;
      if (A[mid] == target)
        return mid;
      if (A[left] < A[mid])
      {
        if (A[left] <= target && target < A[mid])
        {
          right = mid - 1;
        }
        else
        {
          left = mid + 1;
        }
      }
      else if (A[left] > A[mid])
      {
        if (A[right] >= target && target > A[mid])
        {
          left = mid + 1;
        }
        else
        {
          right = mid - 1;
        }
      }
      else
      {
        left++;
      }
    }
    return -1;
  }
}
