import java.util.Arrays;

public class Solution
{
  public boolean isMatch(String s, String p)
  {
    int length = s.length();
    String temp = new String(p);
    if (temp.replace("*", "").length() > length)
      return false;
    boolean[] dp = new boolean[length + 1];
    Arrays.fill(dp, false);
    dp[0] = true;

    for (int i = 0; i < p.length(); i++)
    {
      if (p.charAt(i) != '*')
      {
        for (int n = length - 1; n >= 0; n--)
        {
          dp[n + 1] = dp[n] && (p.charAt(i) == s.charAt(n) || p.charAt(i) == '?');
        }
      }
      else
      {
        for (int n = 1; n <= length; n++)
        {
          dp[n] = dp[n - 1] || dp[n];
        }
      }
      dp[0] = dp[0] && p.charAt(i) == '*';
    }

    return dp[length];
  }
}
