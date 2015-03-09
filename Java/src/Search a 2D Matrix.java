public class Solution
{
  public boolean searchMatrix(int[][] matrix, int target)
  {
    int n = matrix.length - 1;
    int m = matrix[0].length - 1;

    int up = 1;
    int down = n;
    int mid;

    while (up <= down)
    {
      mid = (up + down) / 2;
      if (matrix[mid - 1][m] == target)
        return true;
      if (matrix[mid - 1][m] > target)
      {
        down = mid - 1;
      }
      else
      {
        up = mid + 1;
      }
    }

    int left = 0;
    int right = m;
    while (left <= right)
    {
      mid = (left + right) / 2;
      if (matrix[down][mid] == target)
        return true;
      if (matrix[down][mid] > target)
      {
        right = mid - 1;
      }
      else
      {
        left = mid + 1;
      }
    }
    return false;
  }
}
