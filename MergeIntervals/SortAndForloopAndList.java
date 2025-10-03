// Inner arrays added to a list, instead of a HashMap. List then converted to 2D array

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Comparator;

class Solution {
    public int[][] merge(int[][] intervals) {
        HashMap<Integer, int[]> hashMap = new HashMap<>();

        Arrays.sort(intervals, (row, rowNext) -> Integer.compare(row[0], rowNext[0]));
        
        List<int[]> list = new ArrayList<>();
        int L = intervals[0][0];
        int R = intervals[0][1];

        for (int i = 0; i < intervals.length; i++) {
            if (i == intervals.length - 1) {
                list.add(new int[2]);
                list.get(list.size() - 1)[0] = L;
                list.get(list.size() - 1)[1] = R;
            } else {
                if (R >= intervals[i + 1][0]) {
                    R = Math.max(R, intervals[i + 1][1]);
                    L = Math.min(L, intervals[i + 1][0]);
                } else {
                    list.add(new int[2]);
                    list.get(list.size() - 1)[0] = L;
                    list.get(list.size() - 1)[1] = R;
                    L = intervals[i + 1][0];
                    R = intervals[i + 1][1];
                }   
            }       
        } 

        return list.toArray(new int[list.size()][]);
    } 
}
