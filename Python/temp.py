k = raw_input()
l = raw_input()
Klist = l.split()
thisSum = 0
maxSum = 0
thisStack = []
maxStack = []
for i in Klist:
    i = int(i)
    thisSum = thisSum + i
    thisStack.append(i)
    if thisSum > maxSum:
        maxSum = thisSum
        maxStack = thisStack[:]
    if thisSum < 0:
        thisSum = 0
        thisStack = []
if maxSum > 0:
    print maxSum, maxStack[0], maxStack[-1]
else:
    print maxSum, 0 , 0