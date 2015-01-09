class MinStack:
    # @param x, an integer
    # @return an integer
    def __init__(self):
        self._stack = []
        self._min= None

    def push(self, x):
        self._stack.append(x)
        if self._min == None or x < self._min: # 需要改
            self._min = x

    # @return nothing
    def pop(self):
        top = self._stack.pop()
        if top == self._min:
            if self._stack:
                self._min = min(self._stack)
            else:
                self._min = None


    # @return an integer
    def top(self):
        return self._stack[-1]


    # @return an integer
    def getMin(self):
        return self._min