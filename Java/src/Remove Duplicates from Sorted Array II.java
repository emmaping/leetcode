public class Solution
{
  public int removeDuplicates(int[] A)
  {
    int length = A.length;
    int count = 0;
    if (length < 3)
      return length;
    for (int i = 0; i < length; i++)
    {
      if (i > length - 3 || A[i + 2] > A[i])
        A[count++] = A[i];
    }
    return count;
  }
}
