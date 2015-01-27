public class Solution {
    public String largestNumber(int[] num) {
        Comparator<String> cmp = new StringCmp();
        String[] nums = new String[num.length];
        for (int i=0; i<num.length; i++){
            nums[i] = String.valueOf(num[i]);
        }
        Arrays.sort(nums,cmp);
        StringBuilder ret = new StringBuilder();
        for (String s:nums){
            ret.append(s);
        }
        return ret.charAt(0)=='0'?"0":ret.toString();
    }
    class StringCmp implements Comparator<String>{
        public int compare(String a, String b){
            return -(a+b).compareTo(b+a);
        }
    }
}