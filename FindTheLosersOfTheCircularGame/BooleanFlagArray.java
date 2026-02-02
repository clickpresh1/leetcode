class Solution {
    public int[] circularGameLosers(int n, int k) {
        boolean[] boos = new boolean[n];

        boos[0] = true;
        int j = 1, friend = 0;
        while (true) {
            int r = (k * j++) % n;
            int x = (friend + r) % n;

            if (!boos[x]) {
                boos[x] = true;
                friend = x;
            } else break; 
        } 

        int[] res = new int[n - j + 1];

        for (int i = 0, w = 0; i < n; i++) {
            if (!boos[i]) res[w++] = i + 1;
        } 

        return res;
    } 
}
