import java.util.Arrays;

public class Solution
{
  public int uniquePathsWithObstacles(int[][] obstacleGrid)
  {
    int n = obstacleGrid.length;
    int m = obstacleGrid[0].length;

    int[][] grid = new int[n][m];

    for (int[] row : grid)
      Arrays.fill(row, 0);

    if (obstacleGrid[0][0] == 1)
    {
      return 0;
    }
    else
    {
      grid[0][0] = 1;
    }

    for (int i = 1; i < m; i++)
    {
      if (obstacleGrid[0][i] == 1)
      {
        break;
      }
      else
      {
        grid[0][i] = 1;
      }
    }

    for (int j = 1; j < n; j++)
    {
      if (obstacleGrid[j][0] == 1)
      {
        break;
      }
      else
      {
        grid[j][0] = 1;
      }
    }

    for (int j = 1; j < n; j++)
    {
      for (int i = 1; i < m; i++)
      {
        if (obstacleGrid[j][i] == 1)
        {
          grid[j][i] = 0;
        }

        else
        {
          grid[j][i] = grid[j - 1][i] + grid[j][i - 1];
        }
      }
    }
    return grid[n - 1][m - 1];
  }
}
