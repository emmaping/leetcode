class Solution:
    # @return a string
     def countAndSay(self, n):
        say = '1'
        if n == 1:
            return say
        for i in xrange(n - 1):
            next = ''
            for item in [list(g) for k, g in itertools.groupby(say)]:
                next += str(len(item)) + str(item[0])
            say = next
        return next