public class Solution {
    public int[] plusOne(int[] digits) {
        int plus = 1;
        for (int i = digits.length - 1; i >=0 ; i--){
            if (digits[i] + plus < 10){
                digits[i] = digits[i] + plus;
                return digits;
            }
            else{
                digits[i] = digits[i] + plus - 10;
            }
        }
        int[] newDigits = new int[digits.length+1];
         
        newDigits[0] = 1;
        System.arraycopy(digits, 0, newDigits, 1, digits.length-1);
         
        return newDigits;
    }
}