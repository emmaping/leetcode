
"""
Given an array of integers, every element appears twice except for one. Find that single one.

Note:
Your algorithm should have a linear runtime complexity. Could you implement it without using extra memory?
"""
def singleNumber(A):
    single = A[0]
    for i in range(1,len(A)):
        single = A[i] ^ single
    return single

A = [22,34,22,16,34,16,27]

print singleNumber(A)
    