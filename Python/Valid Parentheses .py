class Solution:
    # @return a boolean
    def isValid(self, s):
        bracksets = {')':'(',']':'[','}':'{'}
        
        
        if not s:
            return False
        charlist = []
        for c in s:
            if c == '(' or c == '{' or c== '[':
                charlist.append(c)
            if c == ')' or c == '}' or c== ']':
                if not charlist:
                    return False
                if charlist[-1] == bracksets[c]:
                     charlist.pop()
                else:
                    return False
        return False if charlist else True