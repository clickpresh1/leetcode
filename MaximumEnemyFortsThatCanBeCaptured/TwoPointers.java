class Solution {
    public int captureForts(int[] forts) {
        int m = forts.length, max = 0, i = 0;

        while (i < m) {
            int g = forts[i];
            
            if (g != 0) {
                int x = 0;

                while (++i < m) {
                    if (forts[i] == 0) x++; 
                    else {
                        if (forts[i] == (-1 * g)) if (x > max) max = x;

                        break;
                    } 
                }
            } else i++;
        } 

        return max;
    }
}
