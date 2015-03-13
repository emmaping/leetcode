
class Solution:
    # @return a string
    def getPermutation(self, n, k):
        array = range(1, n + 1) // 获取[1,2,...n]列表
        k = (k % math.factorial(n)) - 1 // 或者k = (k-1) % math.factorial(n)， 对n的阶乘取余数，以考虑k比n！更大的情况
        permutation = []
        for i in xrange(n - 1, -1, -1):
            idx, k = divmod(k, math.factorial(i))
            permutation.append(array.pop(idx))
    
        return "".join(map(str, permutation)) //此处要转成str才能拼接