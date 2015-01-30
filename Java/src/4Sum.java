public class Solution {
    public List<List<Integer>> fourSum(int[] num, int target) {
        List<List<Integer>> ret = new ArrayList<>();

        if (num == null || num.length < 4) return ret;
        Arrays.sort(num);

        for (int v=0; v < num.length-2; v++){
            for(int i=v+1; i< num.length-1; i++){
                int left = i+1;
                int right = num.length -1;
                while (left < right){
                    int sum = num[v]+ num[i] + num[left] + num[right];
                    if (sum == target){
                        List<Integer> result = Arrays.asList(num[v], num[i], num[left], num[right]);
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
                    else if(sum < target){
                        left++;
                    }
                    else{
                        right--;
                    }
                }
            }
        }
        return ret;
    }
}