class Solution:
    # @param words, a list of strings
    # @param L, an integer
    # @return a list of strings
    ret =[]
    def fullJustify(self, words, L):
        length = 0
        cur = []
        if L == 0:
            return [""]
            
        for w in words:           
            if length + len(w) > L-len(cur)+1:
                self.joinWord(cur, L - length)
                length = len(w)
                cur = [w]
            else:
                cur.append(w)
                length += len(w)
                
        if cur:
            lastline = " ".join(cur)
            self.ret.append(lastline + " "*(L- len(lastline)))   
 
        return self.ret
    
    
    def joinWord(self, cur, r):
        s = ""
        if r == 0 or len(cur) == 1:
            self.ret.append(cur[0])
            return
        
        for i in range(r % (len(cur) - 1)):
            s += cur[i] + " "*(r//(len(cur)-1) + 1)
        for i in range(r % (len(cur) - 1), len(cur) -1):
            s += cur[i] + " "*(r//(len(cur)-1))
        s += cur[-1]
        self.ret.append(s)
            
s = Solution()
print s.fullJustify(["a"], 1)