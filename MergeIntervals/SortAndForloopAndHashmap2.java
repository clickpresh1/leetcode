// A different type of sort; improves runtime
// L = Math.min(L, intervals[i + 1][0]);, is add to improve L

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;

class Solution {
    public int[][] merge(int[][] intervals) {
        HashMap<Integer, int[]> hashMap = new HashMap<>();

        Arrays.sort(intervals, (row, rowNext) -> Integer.compare(row[0], rowNext[0]));
        
        int L = intervals[0][0];
        int R = intervals[0][1];
        int count = -1;
        for (int i = 0; i < intervals.length; i++) {
            if (i == intervals.length - 1) {
                count += 1;
                hashMap.put(count, new int[2]);
                hashMap.get(count)[0] = L;
                hashMap.get(count)[1] = R;
                
            } else {
                if (R >= intervals[i + 1][0]) {
                    R = Math.max(R, intervals[i + 1][1]);
                    L = Math.min(L, intervals[i + 1][0]);
                } else {
                    count += 1;
                    hashMap.put(count, new int[2]);
                    hashMap.get(count)[0] = L;
                    hashMap.get(count)[1] = R;
                    L = intervals[i + 1][0];
                    R = intervals[i + 1][1];
                }   
            }       
        } 

        int[][] mergeArr = new int[hashMap.size()][2];
        for (int i = 0; i < hashMap.size(); i++) {
            mergeArr[i] = hashMap.get(i);
        }

        return mergeArr;
    } 
}
