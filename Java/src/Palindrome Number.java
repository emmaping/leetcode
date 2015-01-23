public class Solution {
    public boolean isPalindrome(int x) {
        if(x<0){
            return false;
        }
        if(x<10){
           return true; 
        }
        int length = (int)Math.log10(x) + 1;
        int num = x;
        for (int i=0; i<length/2 ; i++){
            double m = Math.floor((num%(Math.pow(10, i+1)))/Math.pow(10, i));
            double n = Math.floor((num%(Math.pow(10, length - i)))/Math.pow(10, length - i-1));
            if (m != n){
                return false;
            } 
        }
        return true;
    
    }
}