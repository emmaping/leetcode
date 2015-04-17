import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Solution
{
  Set<String> dict;
  Map<String, List<String>> saved;

  public List<String> wordBreak(String s, Set<String> wordDict)
  {
    this.dict = wordDict;
    this.saved = new HashMap<>();
    return helper(s);

  }

  public List<String> helper(String s)
  {
    List<String> cur = new ArrayList<>();
    if (saved.get(s) != null)
    {
      return saved.get(s);
    }
    if (s.length() == 0)
    {
      return cur;
    }

    for (int i = 0; i < s.length(); i++)
    {
      if (dict.contains(s.substring(0, i)))
      {
        if (i == s.length() - 1)
        {
          cur.add(s.substring(0, i + 1));
        }
        else
        {
          List<String> subList = helper(s.substring(i + 1, s.length()));
          for (String l : subList)
          {
            cur.add(s.substring(i + 1, s.length()) + " " + l);
          }
        }
      }
    }
    saved.put(s, cur);
    return cur;
  }
}
