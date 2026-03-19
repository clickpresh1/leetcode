class Solution {
    public boolean asteroidsDestroyed(int mass, int[] asteroids) {
        int m = asteroids.length, mn = 100001, mx = 0;
        long sum = mass;
        int[] map = new int[100001];

        for (int i = 0; i < m; i++) {
            int ast = asteroids[i];
            map[ast]++; 

            if (ast > mx) mx = ast;
            if (ast < mn) mn = ast;
        } 

        if (sum < mn) return false;

        for (int i = mn; i < mx + 1; i++) {
            long f = map[i];

            if (f != 0) {
                if (sum < i) return false;
                sum += f * i;
            } 

            if (sum > mx) return true;
        } 

        return true;
    }
}
