class Solution:
    def removeElement(self, A, elem):
        if not A:
            return None
        length = len(A)
        count = 0
        for i in range(length):
            if A[i] == elem:
                count = count + 1
            else:
                A[i-count] = A[i]
        return length - count
