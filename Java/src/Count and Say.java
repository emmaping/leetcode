public class Solution {
    public String countAndSay(int n) {
        String say = "1";
        if (n == 1){
            return say;
        }
        for (int i = 1 ; i<n; i++){
            String next = "";
            int count = 1;
            for (int j=0 ; j < say.length()-1; j++){
                if (say.charAt(j) != say.charAt(j+1)){
                    next = next + Integer.toString(count)+ say.charAt(j);
                    count = 1;
                }
                else{
                    count++ ;
                }
            }
            if (count == 1){
                next = next + "1" + say.charAt(say.length()-1);
            }
            else{
                next = next+Integer.toString(count)+ say.charAt(say.length()-2);
            }
            say = new String(next);
        }
        return say;
    }
}