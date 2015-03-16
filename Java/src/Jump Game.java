public class Solution
{
  public boolean canJump(int[] A)
  {
    int length = A.length;
    int i = 0;
    int reach = 0;
    while (i < length && i <= reach)
    {
      reach = Math.max(i + A[i], reach);
      i++;
    }

    return i == length;

  }
}
