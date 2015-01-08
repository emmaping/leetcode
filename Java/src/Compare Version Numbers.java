public class Solution
{
  public int compareVersion(String version1, String version2)
  {
    String[] list1 = version1.split("\\.");
    String[] list2 = version2.split("\\.");

    int length;
    if (list1.length >= list2.length)
    {
      length = list2.length;
    }
    else
    {
      length = list1.length;
    }

    for (int i = 0; i < length; i++)
    {
      if (Integer.parseInt(list1[i]) > Integer.parseInt(list2[i]))
      {
        return 1;
      }
      else if (Integer.parseInt(list1[i]) < Integer.parseInt(list2[i]))
      {
        return -1;
      }
    }
    if (list1.length > length)
    {
      if (getSum(list1, length) != 0)
      {
        return 1;
      }
      else
      {
        return 0;
      }

    }
    else if (list2.length > length)
    {
      if (getSum(list2, length) != 0)
      {
        return -1;
      }
      else
      {
        return 0;
      }

    }
    else
    {
      return 0;
    }
  }

  public int getSum(String[] list, int length)
  {
    int sum = 0;
    for (int i = length; i < list.length; i++)
    {
      sum = sum + Integer.parseInt(list[i]);
    }
    return sum;
  }
}
