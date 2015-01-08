class Solution:
    # @return a string
    def convert(self, s, nRows):
        if nRows == 1:
            return s
            
        length = len(s)
        if length <= 1:
            return s
            
        i,j  = divmod( length, 2*nRows-2)
        col = 0
        
        if j == 0:
            col = i*(nRows-1)
        elif j <= nRows:
            col = i*(nRows-1) + 1
        else:
            col = i*(nRows-1) + 1 + j- nRows
            
        matrix = [[0 for i in range(col)] for j in range(nRows)]

        for k in range(length):
            m,n = divmod(k, 2*nRows-2)
            if n < nRows:
                x = n
                y = m*(nRows-1)
            else:
                x = 2 * nRows - n - 2
                y = m*(nRows-1) + n- nRows + 1
            print x, y, k
            matrix[x][y] = s[k]
        print matrix    
        ret = []
        for n in range(nRows):
            for m in range(col):
                if matrix[n][m] !=0 :
                    ret.append(matrix[n][m])
        return "".join(ret)
                
    
        

s = Solution()
print s.convert('ABCD',3)    
                
                
            
            
            