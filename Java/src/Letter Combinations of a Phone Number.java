public class Solution {
    public List<String> letterCombinations(String digits) {
        Map<Character, String> pad = new HashMap<>();
        pad.put('2',"abc");
        pad.put('3',"def");
        pad.put('4',"ghi");
        pad.put('5',"jkl");
        pad.put('6',"mno");
        pad.put('7',"pqrs");
        pad.put('8',"tuv");
        pad.put('9',"wxyz");
        
        if(digits.length()== 0) return new ArrayList(Arrays.asList(""));

        List<String> cb0 = letterCombinations(digits.substring(0,digits.length()-1));
        List<String> cb1 = new ArrayList<>();
        char c = digits.charAt(digits.length() - 1);
        String s = pad.get(c);

        for(int i=0; i< s.length(); i++){
            String sAppend = s.substring(i,i+1);
            for (String sPrevious: cb0 ){
                String newS = sPrevious + sAppend;
                cb1.add(newS);
            }
        }
        return cb1;
    }
}