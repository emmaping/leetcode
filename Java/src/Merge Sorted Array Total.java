public class Solution
{
  public void merge(int A[], int m, int B[], int n)
  {
    int i = m - 1;
    int j = n - 1;
    int cur = m + n - 1;
    while (i >= 0 && j >= 0)
    {
      if (A[i] < B[j])
      {
        A[cur] = B[j];
        j--;
      }
      else
      {
        A[cur] = A[i];
        i--;
      }
      cur--;
    }
    while (j >= 0)
    {
      A[cur] = B[j];
      j--;
      cur--;
    }
  }
}
