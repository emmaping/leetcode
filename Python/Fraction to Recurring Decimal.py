class Solution:
    # @return a string
    def fractionToDecimal(self, numerator, denominator):
        if numerator == 0:
            return "0";
        ret = []
        if (numerator > 0) ^ (denominator > 0):
            ret.append("-")
        numerator = abs(numerator);
        denominator = abs(denominator)

        ret.append(str(numerator // denominator))
        if numerator % denominator == 0:
            return "".join(ret)
        else:
            ret.append(".")
        resultMap = {}

        remain = numerator % denominator
        while  remain != 0:
            if remain in resultMap:
                ret.insert(resultMap[remain] ,"(")
                ret.append(")")
                break
            resultMap[remain] = len(ret)
            remain *= 10
            ret.append(str(remain // denominator))
            remain %= denominator
        return "".join(ret)