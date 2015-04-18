class Solution:
    # @param s, a string
    # @param p, a string
    # @return a boolean
    def isMatch(self, s, p):
        matrix = [[ False for i in range(len(p)+1)] for j in range(len(s)+1)]
        matrix[0][0] = True
        isValid = False
        for i in range(2, len(p)+1, 2):
            if p[i-1] == "*":
                isValid = True
                matrix[0][i] = True;
            else:
                break
        
        for i in range(1,len(p)+1):
            for j in range(1,len(s)+1):
                if s[j-1] == p[i-1] or p[i-1] == "." :
                    matrix[j][i] = matrix[j-1][i-1]
                elif p[i-1] == "*":
                    if s[j-1] == p[i-2] or p[i-2] == ".":
                        matrix[j][i] = matrix[j-1][i] or matrix[j][i-2]
                    else:
                        matrix[j][i] = matrix[j][i-2]

        return matrix[len(s)][len(p)]
