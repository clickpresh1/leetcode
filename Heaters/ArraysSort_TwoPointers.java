class Solution {
    public int findRadius(int[] houses, int[] heaters) {
        int m = houses.length, n = heaters.length; 

        Arrays.sort(houses);
        Arrays.sort(heaters);

        int mn = 0, x = 0, y = 0;

        while (x < m) {
            int a = Math.abs(houses[x] - heaters[y]);

            int v = y;

            while (v < n) {
                int d = Math.abs(houses[x] - heaters[v]);

                if (d <= a) {
                    a = d;
                    y = v;
                } else break;

                v++;
            } 

            mn = Math.max(mn, a);

            x++;
        } 

        return mn;
    }
}
