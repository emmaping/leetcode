class Solution:
    # @return a list of strings, [s1, s2]
    def letterCombinations(self, digits):
        # define a dictionary of the character <-> number projection
        pad = {'2':'abc', '3':'def', '4':'ghi', '5':'jkl', '6':'mno', '7':'pqrs', '8':'tuv', '9':'wxyz'}
        # if the input is empty
        if len(digits) == 0:
            return [""]

        comb0 = self.letterCombinations(digits[:-1])
        string1 = pad[digits[-1]]
        comb1 = []
        for s in string1:
            for c in comb0:
                cs = c+s
                comb1.append(cs)
        return comb1