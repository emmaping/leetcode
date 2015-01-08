class Solution:
    # @return a boolean
    def isPalindrome(self, x):
        if x < 0:
            return False
        x = list(str(x))
        length = len(x)
        if x == None or length == 1:
            return True

        for i in range(length//2):
            if x[i] != x[length - i -1]:
                return False
        return True
s = Solution()
print s.isPalindrome(-2147447412)