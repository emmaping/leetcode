class Solution:
    # @param tokens, a list of string
    # @return an integer
    def evalRPN(self, tokens):
        value = []
        op = ("+","-","*","/")
        for i in tokens:
            if i in op:
                last = value.pop()
                sec = value.pop()
                if i == "+":
                    value.append(sec + last)
                elif i == "*":
                    value.append(sec * last)
                elif i == "-":
                    value.append(sec - last)
                elif i == "/":
                    value.append(int(float(sec) / last))
            else:
                value.append(int(i))
        return value[-1]