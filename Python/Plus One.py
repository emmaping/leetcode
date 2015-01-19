class Solution:
    # @param digits, a list of integer digits
    # @return a list of integer digits
    def plusOne(self, digits):
        plus = 1
        for i in range(len(digits)-1, -1, -1):
            if digits[i] + plus < 10:
                digits[i] = digits[i] + plus
                return digits
            else:
                digits[i] = digits[i] + plus - 10
        digits.insert(0,1)
        return digits
                

        
        