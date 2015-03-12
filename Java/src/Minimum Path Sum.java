import java.util.Arrays;

public class Solution
{
  public int minPathSum(int[][] grid)
  {
    int n = grid.length;
    int m = grid[0].length;
    int ret = 0;

    if (n == 1 && m == 1)
      return grid[0][0];
    if (n == 1)
    {
      for (int i = 0; i < m; i++)
      {
        ret += grid[0][i];
      }
      return ret;
    }
    if (m == 1)
    {
      for (int j = 0; j < m; j++)
      {
        ret += grid[j][0];
      }
      return ret;
    }

    int[][] path = new int[n][m];
    for (int[] row : path)
    {
      Arrays.fill(row, 0);
    }
    path[0][0] = grid[0][0];

    for (int col = 1; col < m; col++)
      path[0][col] = path[0][col - 1] + grid[0][col];
    for (int row = 1; row < n; row++)
      path[row][0] = path[row - 1][0] + grid[row][0];

    for (int col = 1; col < m; col++)
    {
      for (int row = 1; row < n; row++)
      {
        path[row][col] = Math.min(path[row - 1][col], path[row][col - 1]) + grid[row][col];
      }
    }
    return path[n - 1][m - 1];
  }
}
