class Solution {
    public boolean isCovered(int[][] ranges, int left, int right) {
        int m = right - left + 1;

        int x = left, k = 0;

        while (k < 2) {
            for (int i = 0; i < ranges.length; i++) {

                int a = ranges[i][0];
                int b = ranges[i][1];

                if ((x >= a) && (x <= b)) {
                    if (x == right) return true;

                    x++;
                    
                    while (x <= b) {
                        if (x == right) return true;

                        x++;
                    }
                } 
            } 

            k++;
        }

        return false;
    } 
}
