/**
 * Definition for a point.
 * class Point {
 *     int x;
 *     int y;
 *     Point() { x = 0; y = 0; }
 *     Point(int a, int b) { x = a; y = b; }
 * }
 */
public class Solution {
    public int maxPoints(Point[] points) {
        if (points.length < 2) return points.length;
        int ret = 0;
        for (int i = 0; i < points.length; i++){
            int dupPoint = 1;
            Map<Double, Integer> map = new HashMap<>();
            for (int j = i +1; j < points.length; j++){
            	if (points[i].x == points[j].x && points[i].y == points[j].y) {
					dupPoint++;
				}
            	else if (points[i].y == points[j].y) {
					helper(Double.NaN, map);
				}
            	else {
					double bias = Math.round( ((double)( points[i].x - points[j].x )/(double)( points[i].y - points[j].y)) * 1000 ) / 1000.0;
					helper(bias, map);
				}
            }
            
            int localMax = 0;
            for (int v : map.values()){
            	localMax = Math.max(localMax, v);
            }
            ret = Math.max(ret, localMax + dupPoint);
        }
        return ret;
    }
    
    private void helper(double key, Map<Double, Integer> map){
    	if (map.containsKey(key)) {
			map.put(key, map.get(key)+1);
		}
    	else {
			map.put(key, 1);
		}
    }
}