public class Solution
{
  // you need treat n as an unsigned value
  public int reverseBits(int n)
  {
    int ret = 0;
    for (int count = 0; count < 32; count++)
    {
      ret = ret * 2 + ((n >> count) & 1);
    }
    return ret;
  }
}
