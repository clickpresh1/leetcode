import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        int L = 0;
        int R = intervals.length - 1;
        int mid = L + ((R - L) / 2);
        
        while (L <= R) {
            mid = L + ((R - L) / 2);
            if ((intervals[mid][0] > newInterval[0])) R = mid - 1; 
            else L = mid + 1;
        } 

        int[][] newArr = new int[intervals.length + 1][2];
        for (int i = 0; i < mid; i++) {
            newArr[i] = intervals[i];
        } 

        newArr[mid] = newInterval;

        for (int i = mid + 1; i < newArr.length; i++) {
            newArr[i] = intervals[i - 1];
        } 
        Arrays.sort(newArr, (row, rowNext) -> Integer.compare(row[0], rowNext[0]));

        List<int[]> list = new ArrayList<>();
        int L2 = newArr[0][0];
        int R2 = newArr[0][1];

        for (int i = 0; i < newArr.length; i++) {
            if (i == newArr.length - 1) {
                list.add(new int[2]);
                list.get(list.size() - 1)[0] = L2;
                list.get(list.size() - 1)[1] = R2;
            } else {
                if (R2 >= newArr[i + 1][0]) {
                    R2 = Math.max(R2, newArr[i + 1][1]);
                    L2 = Math.min(L2, newArr[i + 1][0]);
                } else {
                    list.add(new int[2]);
                    list.get(list.size() - 1)[0] = L2;
                    list.get(list.size() - 1)[1] = R2;
                    L2 = newArr[i + 1][0];
                    R2 = newArr[i + 1][1];
                }   
            }       
        } 

        return list.toArray(new int[list.size()][2]);
    } 
} 
