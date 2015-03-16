import java.util.ArrayList;

public class Solution
{
  public List<Integer> spiralOrder(int[][] matrix)
  {
    List<Integer> ret = new ArrayList<>();
    int m = matrix.length;
    if (m == 0)
      return ret;
    int n = matrix[0].length;

    int up = 0;
    int down = m - 1;
    int left = 0;
    int right = n - 1;

    while (up <= down && left <= right)
    {
      for (int j = left; j <= right; j++)
        ret.add(matrix[up][j]);
      up++;

      for (int j = up; j <= down; j++)
        ret.add(matrix[j][right]);
      right--;

      if (up <= down)
      {
        for (int j = right; j >= left; j--)
          ret.add(matrix[down][j]);
      }
      down--;

      if (left <= right)
      {
        for (int j = down; j >= up; j--)
          ret.add(matrix[j][left]);
      }
      left++;

    }
    return ret;
  }
}
