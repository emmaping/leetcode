class Solution:
    # @param s, a string
    # @return a string
    def reverseWords(self, s):
        stack = []
        word = []
        lastisblank = False
        for c in s:
            if c != " ":
                word.append(c)
                lastisblank = False
            elif lastisblank and c == " ":
                pass
            else:
                stack.append(word)
                word = []
                lastisblank = True
        if word:
            stack.append(word)
        reverseword = []
        print stack
        for w in stack[::-1]:
            reverseword.append("".join(w))
            
        ret =  " ".join(reverseword)       
        return ret

s = Solution()
print s.reverseWords("a")