public class Solution
{
  public int maxProfit(int[] prices)
  {
    int holdOne = Integer.MIN_VALUE, holdTwo = Integer.MIN_VALUE;
    int sellOne = 0, sellTwo = 0;
    for (int i : prices)
    {
      sellTwo = Math.max(sellTwo, holdTwo + i);
      holdTwo = Math.max(holdTwo, sellOne - i);
      sellOne = Math.max(sellOne, holdOne + i);
      holdOne = Math.max(holdOne, -i);
    }
    return sellTwo;
  }
}
