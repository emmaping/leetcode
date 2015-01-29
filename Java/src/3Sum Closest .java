public class Solution {
    public int threeSumClosest(int[] num, int target) {
        Arrays.sort(num);
        int ret = num[0]+num[1]+num[num.length -1];
        for (int i = 0; i<num.length-2; i++){
            int left = i+1;
            int right = num.length - 1;
            while(left < right){
                int sum = num[i] + num[left] + num[right];
                if (sum > target){
                    right-- ;
                }
                else if(sum< target){
                    left++;
                }
                else{
                    return sum;
                }

                if (Math.abs(sum-target) < Math.abs(ret-target)){
                    ret = sum;
                }
            }
        }
        return ret;
    }
}