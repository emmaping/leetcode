public class Solution
{
  public double pow(double x, int n)
  {
    if (n < 0)
    {
      n = -n;
      x = 1 / x;
    }
    double ret = 1;
    while (n > 0)
    {
      if (n % 2 == 1)
        ret *= x;
      x = x * x;
      n = n >> 1;
    }
    return ret;
  }
}
