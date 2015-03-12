import java.util.Arrays;

public class Solution
{
  public int uniquePaths(int m, int n)
  {
    if (m == 0 || n == 0)
      return 0;
    if (m == 1 || n == 1)
      return 1;

    int[][] grid = new int[n][m];
    for (int[] row : grid)
    {
      Arrays.fill(row, 0);
    }

    Arrays.fill(grid[0], 1);
    for (int j = 0; j < n; j++)
      grid[j][0] = 1;

    for (int j = 1; j < n; j++)
    {
      for (int i = 1; i < m; i++)
      {
        grid[j][i] = grid[j - 1][i] + grid[j][i - 1];
      }
    }
    return grid[n - 1][m - 1];
  }
}
