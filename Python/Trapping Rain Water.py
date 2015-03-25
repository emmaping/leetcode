class Solution:
    # @param A, a list of integers
    # @return an integer
    def trap(self, A):
        if not A:
            return 0
            
        stack = []
        stack.append(0)
        
        ret = 0
        
        for i in range(len(A)):
            if A[i]< stack[0]:
                stack.append(A[i])
            elif A[i] >= stack[0]:
                ret = ret + stack[0] * (len(stack)-1) - sum(stack[1:])
                stack = [A[i]]
        if stack[0] != A[-1]:
            A = stack[::-1]
            stack = [0]
            for i in range(len(A)):
                if A[i]< stack[0]:
                    stack.append(A[i])
                elif A[i] >= stack[0]:
                    ret = ret + stack[0] * (len(stack)-1) - sum(stack[1:])
                    stack = [A[i]]
        return ret