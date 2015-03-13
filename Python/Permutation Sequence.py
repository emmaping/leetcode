
class Solution:
    # @return a string
    def getPermutation(self, n, k):
        array = range(1, n + 1) // ��ȡ[1,2,...n]�б�
        k = (k % math.factorial(n)) - 1 // ����k = (k-1) % math.factorial(n)�� ��n�Ľ׳�ȡ�������Կ���k��n����������
        permutation = []
        for i in xrange(n - 1, -1, -1):
            idx, k = divmod(k, math.factorial(i))
            permutation.append(array.pop(idx))
    
        return "".join(map(str, permutation)) //�˴�Ҫת��str����ƴ��