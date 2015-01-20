public class Solution {
    public String addBinary(String a, String b) {
        String ret = "";
        int plus = 0;
        for(int i = a.length()-1, j = b.length()-1 ; i>=0 || j>=0; i--,j--){
            int aInt = ((i<0)?0: Character.getNumericValue(a.charAt(i)));
            int bInt = ((j<0)?0: Character.getNumericValue(b.charAt(j)));
            ret = ((aInt ^ bInt)^plus) + ret;
            plus = ((aInt + bInt + plus) >1) ?1:0;
        }
        if (plus == 1)
            ret = '1'+ ret;
        return ret;
 
    }
}