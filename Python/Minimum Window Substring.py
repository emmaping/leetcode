class Solution:
    # @return a string
    def minWindow(self, S, T):
        dp = {}
        for char in T:
            dp[char] = []
        listT = list(T)
        start = 0
        end = len(S)
        for i in range(len(S)):
            if S[i] in T:
                if S[i] not in listT and dp[S[i]] != []:
                    dp[S[i]].pop(0)
                elif S[i] in listT:
                    listT.remove(S[i])
                dp[S[i]].append(i)
            if listT == []:
                maximum = max([x[-1] for x in dp.values()])
                minimum = min([x[0] for x in dp.values()])
                if maximum-minimum+1 < end-start+1:
                    start = minimum
                    end = maximum
            print listT, dp,start, end+1
        if listT != []:
            return ""
        else:
            return S[start:end+1]
s = Solution()
print s.minWindow("AACCCBEABCODEBANC", "AB")