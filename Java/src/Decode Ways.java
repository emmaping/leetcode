public class Solution
{
  public int numDecodings(String s)
  {
    int length = s.length();
    if (length == 0 || s.charAt(0) == '0')
      return 0;

    int r1 = 1;
    int r2 = 1;
    for (int i = 1; i < length; i++)
    {
      if (s.charAt(i) == '0')
        r1 = 0;
      if (s.charAt(i - 1) == '1' || s.charAt(i - 1) == '2' && s.charAt(i) <= '6')
      {
        r1 = r2 + r1;
        r2 = r1 - r2;
      }
      else
      {
        r2 = r1;
      }
    }

    return r1;
  }
}
