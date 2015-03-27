import java.util.ArrayList;

/**
 * Definition for an interval.
 * public class Interval {
 * int start;
 * int end;
 * Interval() { start = 0; end = 0; }
 * Interval(int s, int e) { start = s; end = e; }
 * }
 */
public class Solution
{
  public List<Interval> insert(List<Interval> intervals, Interval newInterval)
  {
    List<Interval> result = new ArrayList<>();
    int i = 0;
    while (i < intervals.size())
    {
      if (newInterval.start <= intervals.get(i).end)
      {
        if (newInterval.end < intervals.get(i).start)
        {
          break;
        }
        newInterval.start = Math.min(newInterval.start, intervals.get(i).start);
        newInterval.end = Math.max(newInterval.end, intervals.get(i).end);
      }
      else
      {
        result.add(intervals.get(i));
      }
      i++;
    }
    result.add(newInterval);
    while (i < intervals.size())
    {
      result.add(intervals.get(i));
      i++;
    }

    return result;
  }
}
