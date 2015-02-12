public class temp
{
  public static class Person
  {

    public static int divide(int dividend, int divisor)
    {
      boolean isNeg = (dividend > 0 && divisor < 0) || (dividend < 0 && divisor > 0);

      long ldividend = Math.abs((long) dividend);
      final long ldivisor = Math.abs((long) divisor);
      if (ldividend < ldivisor)
        return 0;
      long result = 0;

      for (int i = Integer.SIZE - 1; i >= 0 && ldividend >= ldivisor; i--)
      {
        if (ldividend >= (ldivisor << i))
        {
          ldividend -= ldivisor << i;
          result |= 1 << i;
        }
      }
      if (isNeg)
        result = -result;
      return Math.min((int) result, Integer.MAX_VALUE);
    }

  }

  public static void main(String[] args)
  {
    System.out.println(Person.divide(-2147483648, -1));
  }
}
