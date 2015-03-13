import java.util.Arrays;

public class Solution
{
  public int[][] generateMatrix(int n)
  {
    int[][] ret = new int[n][n];
    if (n == 0)
      return ret;
    if (n == 1)
    {
      ret[0][0] = 1;
      return ret;
    }

    for (int[] row : ret)
      Arrays.fill(row, 0);

    int up = 0;
    int down = n - 1;
    int left = 0;
    int right = n - 1;

    int data = 1;

    while (up <= down && left <= right)
    {
      for (int i = left; i <= right; i++)
      {
        ret[up][i] = data;
        data++;
      }
      up++;

      for (int i = up; i <= down; i++)
      {
        ret[i][right] = data;
        data++;
      }
      right--;

      for (int i = right; i >= left; i--)
      {
        ret[down][i] = data;
        data++;
      }
      down--;

      for (int i = down; i >= up; i--)
      {
        ret[i][left] = data;
        data++;
      }
      left++;

    }
    return ret;
  }
}
