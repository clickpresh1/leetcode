class Solution {
    public boolean containsPattern(int[] arr, int m, int k) {
        int len = arr.length;

        for (int i = 0; i < len; i++) {
            int j = i, q = 0;
            if (j + m < len) {
                j += m;
                q++;

                boolean breakMidLoop = false;

                while (j < len) {
                    int r = 0;
                    while (((r < m)) && (j + r < len)) {
                        if (arr[j + r] != arr[j - m + r]) {
                            breakMidLoop = true;
                            break;
                        }

                        r++;
                    } 

                    if ((breakMidLoop) || (r < m)) break;
                    
                    if (++q == k) return true;

                    j += m;
                }
            }
        } 

        return false;
    }
}
