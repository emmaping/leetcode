public class Solution {
    public int strStr(String haystack, String needle) {
        if (needle.length() == 0 || needle.equals(haystack)){
            return 0;
        }
        if (needle.length() > haystack.length()){
            return -1;
        }
        
        for (int i=0; i <= (haystack.length() - needle.length()) ;i++){
            int n = 0;
            while(n < needle.length() && haystack.charAt(i+n) == needle.charAt(n))
                n++;
            if(n == needle.length())
                return i;
        }
        return -1;
         
    }
}