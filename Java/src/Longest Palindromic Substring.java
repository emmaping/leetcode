public class Solution {
    public String longestPalindrome(String s) {
        if(s==null) return s;
        int maxLen = 1;
        int start = 0;
        for(int i=0; i< s.length(); i++){
            if (i-maxLen >=1 && isPalindrome(s.substring(i-maxLen-1,i+1))){
                start=i-maxLen-1;
                maxLen+=2;
                continue;
         }   

            if (i-maxLen >=0 && isPalindrome(s.substring(i-maxLen,i+1))){
                start=i-maxLen;
                maxLen+=1;
            }
        }
        
        return s.substring(start, start+maxLen);
        
    }
    public Boolean isPalindrome(String s){
        String reversed = new StringBuilder(s).reverse().toString();
        return s.equals(reversed);
    }
}