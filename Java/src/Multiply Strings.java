public class Solution
{
  public String multiply(String num1, String num2)
  {
    int len1 = num1.length();
    int len2 = num2.length();
    int[] dp = new int[len1 + len2];

    for (int i = len1 - 1; i >= 0; i--)
    {
      for (int j = len2 - 1; j >= 0; j--)
      {
        dp[len1 + len2 - i - j - 2] += Character.getNumericValue(num1.charAt(i)) * Character.getNumericValue(num2.charAt(j));
        dp[len1 + len2 - i - j - 1] += dp[len1 + len2 - i - j - 2] / 10;
        dp[len1 + len2 - i - j - 2] %= 10;
      }
    }

    StringBuilder ret = new StringBuilder();
    boolean start = false;
    for (int i = dp.length - 1; i >= 0; i--)
    {
      if (dp[i] != 0)
      {
        start = true;
      }
      if (start)
      {
        ret.append(dp[i]);
      }
    }
    if (!start)
      return "0";
    return ret.toString();
  }
}
