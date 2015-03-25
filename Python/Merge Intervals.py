# Definition for an interval.
# class Interval:
#     def __init__(self, s=0, e=0):
#         self.start = s
#         self.end = e

class Solution:
    # @param intervals, a list of Interval
    # @return a list of Interval
    def merge(self, intervals):
            intervals.sort(key=lambda x: x.start)
            res = []
            for i in intervals:
                if res and i.start <= res[-1].end:
                    res[-1].end = max(i.end, res[-1].end)
                else:
                    res.append(i)
            return res