class Solution {
    public int busyStudent(int[] startTime, int[] endTime, int queryTime) {
        int m = startTime.length, count = 0;

        for (int i = 0; i < m; i++) {
            if ((queryTime >= startTime[i]) && (endTime[i] >= queryTime)) count++;
        } 

        return count;
    }
}
