class Solution {
    public int findPoisonedDuration(int[] timeSeries, int duration) {
        int count = 0;
        for (int i = 0; i < timeSeries.length - 1; i++) {
            int x = timeSeries[i];
            while ((x < timeSeries[i] + duration) && (x != timeSeries[i + 1])) {
                x += 1;
                count += 1;
            } 
        } 

        int y = timeSeries[timeSeries.length - 1];
        while (y < timeSeries[timeSeries.length - 1] + duration) {
            y += 1;
            count += 1;
        }

        return count;
    }
}
