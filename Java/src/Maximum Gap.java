public class Solution {
public int maximumGap(int[] num) {
    if (num == null || num.length < 2) return 0;

    int min = num[0];
    int max = num[0];
    for (int i:num) {
        if (max < i){
            max = i;
        }
        else if (min > i){
            min = i;
        }
    }
    
    int average = (int)Math.ceil((double)(max - min)/(num.length - 1));
    int[] mins = new int[num.length - 1]; 
    int[] maxs = new int[num.length - 1]; 
    Arrays.fill(mins, Integer.MAX_VALUE);
    Arrays.fill(maxs, Integer.MIN_VALUE);

    for (int i:num) {
        if (i == min || i == max)
            continue;
        int index = (i - min) / average; 
        mins[index] = Math.min(i, mins[index]);
        maxs[index] = Math.max(i, maxs[index]);
    }

    int ret = Integer.MIN_VALUE;
    int previous = min;
    for (int i = 0; i < num.length - 1; i++) {
        if (mins[i] == Integer.MAX_VALUE && maxs[i] == Integer.MIN_VALUE)
            continue;
        ret = Math.max(ret, mins[i] - previous);
        previous = maxs[i];
    }
    ret = Math.max(ret, max - previous);
    return ret;
}
}