public class Solution {
    public List<List<Integer>> threeSum(int[] num) {
        List<List<Integer>> ret = new ArrayList<>();
        
        if (num == null || num.length < 3) return ret;
        Arrays.sort(num);
     
        for (int i=0; i < num.length; i++){
            int left = i+1;
            int right = num.length -1;
            while (left < right){
                int sum = num[i] + num[left] + num[right];
                if (sum == 0){
                    List<Integer> result = Arrays.asList(num[i], num[left], num[right]);
                    if (!ret.contains(result)) ret.add(result);
                    left++;
                    right--;
                    while(left<right&&num[left]==num[left-1]){
                        left++;
                    }
                    while(left<right&&num[right]==num[right+1]){
                        right--;
                    }
                }
                else if(sum<0){
                    left++;
                }
                else{
                    right--;
                }
                
            }
        }
        return ret;
    }

}