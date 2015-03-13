import java.util.LinkedList;
import java.util.List;

public class temp
{
  public static String getPermutation(int n, int k)
  {
    List<Integer> sequence = new LinkedList<>();
    for (int i = 1; i <= n; i++)
      sequence.add(i);
    k = (k - 1) % factorial(n);
    String permutation = "";

    int idx;
    for (int i = n - 1; i >= 0; i--)
    {
      idx = k / factorial(i);
      k = k % factorial(i);
      System.out.println("idx: " + idx + " k: " + k + "To be append" + sequence.get(idx));
      permutation += sequence.get(idx);
      sequence.remove(idx);
    }
    return permutation;
  }

  public static Integer factorial(int n)
  {
    if (n == 0)
      return 1;
    int factorialN = 1;
    for (int i = 1; i <= n; i++)
    {
      factorialN *= i;
    }
    return factorialN;
  }

  public static void main(String[] args)
  {
    System.out.println(temp.getPermutation(3, 6));
  }
}
