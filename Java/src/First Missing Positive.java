public class Solution
{
  public int firstMissingPositive(int[] A)
  {
    int length = A.length;
    for (int i = 0; i < length; i++)
    {
      int target = A[i];
      if (target > 0 && target <= length && target != A[target - 1])
      {
        int temp = A[target - 1];
        A[target - 1] = target;
        A[i] = temp;
        i--;

      }
    }
    for (int i = 0; i < length; i++)
    {
      if (A[i] != i + 1)
        return i + 1;
    }

    return length + 1;

  }
}
