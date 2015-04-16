public class Solution
{
  public int minCut(String s)
  {
    int length = s.length();
    int[] dp = new int[length + 1];
    boolean[][] matrix = new boolean[length + 1][length + 1];
    for (int i = 1; i <= length; i++)
    {
      dp[i] = i;
      for (int j = 1; j <= i; j++)
      {
        if (s.charAt(i - 1) == s.charAt(j - 1))
        {
          if (i - j < 2 || matrix[j + 1][i - 1])
          {
            matrix[j][i] = true;
            if (j == 1)
              dp[i] = 0;
            else
            {
              dp[i] = Math.min(dp[i], dp[j - 1] + 1);
            }
          }
        }
      }
    }
    return dp[length];
  }
}
