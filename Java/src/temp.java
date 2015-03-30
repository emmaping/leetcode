import java.util.ArrayList;
import java.util.List;

public class temp
{
  private List<String> ret = new ArrayList<>();

  public List<String> fullJustify(String[] words, int L)
  {
    List<String> cur = new ArrayList<String>();
    int length = 0;
    if (L == 0)
    {
      ret.add("");
      return ret;
    }

    for (String s : words)
    {
      if (length + s.length() > L - cur.size() + 1)
      {
        joinWord(cur, L - length);
        length = s.length();
        cur = new ArrayList<String>();
        cur.add(s);
      }
      else
      {
        cur.add(s);
        length += s.length();
      }
    }

    if (cur.size() > 0)
    {
      String lastline = "";
      for (int i = 0; i < cur.size() - 1; i++)
      {
        lastline = lastline + cur.get(i) + " ";
      }
      lastline += cur.get(cur.size() - 1);
      for (int j = 0; j < L - lastline.length(); j++)
      {
        lastline += " ";
      }
      ret.add(lastline);
    }
    return ret;
  }

  public void joinWord(List<String> cur, int r)
  {
    String s = "";
    if (r == 0 || cur.size() == 1)
    {
      ret.add(cur.get(0));
      return;
    }
    for (int i = 0; i < (r % (cur.size() - 1)); i++)
    {
      s += cur.get(i);
      for (int j = 0; j < (r / (cur.size() - 1) + 1); j++)
      {
        s += " ";
      }
    }
    for (int i = (r % (cur.size() - 1)); i < cur.size() - 1; i++)
    {
      s += cur.get(i);
      for (int j = 0; j < (r / (cur.size() - 1)); j++)
      {
        s += " ";
      }
    }
    s += cur.get(cur.size() - 1);
    ret.add(s);
  }

  public static void main(String[] args)
  {
    temp t = new temp();
    String[] words = new String[] { "This", "is", "an", "example", "of", "text", "justification." };

    System.out.println(t.fullJustify(words, 16));
  }
}
