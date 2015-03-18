class Solution:
    # @param strs, a list of strings
    # @return a list of strings
    def anagrams(self, strs):
       d = collections.defaultdict(list)
       for s in strs:
           d[tuple(sorted(s))].append(s)  
       return [a for agram_group in d.values() if len(agram_group)>1 for a in agram_group]