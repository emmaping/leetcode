public class Solution {
    public int romanToInt(String s) {
        Map<Character, Integer> roman_dict = new HashMap<>();
        roman_dict.put('I',1);
        roman_dict.put('V',5);
        roman_dict.put('X',10);
        roman_dict.put('L',50);
        roman_dict.put('C',100);
        roman_dict.put('D',500);
        roman_dict.put('M',1000);
        Map<Character, Integer> roman_ixc = new HashMap<>();
        roman_ixc.put('I',5);
        roman_ixc.put('X',50);
        roman_ixc.put('C',500);
        
        int value = 0;
        for (int i = s.length()-1; i >= 0; i--){
            char c = s.charAt(i);
            if (roman_ixc.get(c) != null && value >= roman_ixc.get(c)){
                value -= roman_dict.get(c);
            }
            else{
                value += roman_dict.get(c);
            }
        }
        return value;
        
    }
}