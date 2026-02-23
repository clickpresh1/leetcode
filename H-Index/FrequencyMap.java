class Solution {
    public int hIndex(int[] citations) {
        int m = citations.length, mx = -1, mn = 1001;
        int[] map = new int[1001];

        for (int cite : citations) {
            map[cite]++;

            if (cite > mx) mx = cite;
            if (cite < mn) mn = cite;
        }

        int x = 1;
        for (int i = mx; i >= mn; i--) {
            int f = map[i] + 1;

            while ((--f > 0) && (i >= x)) x++;
        } 

        return --x;
    }
}
