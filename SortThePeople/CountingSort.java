class Solution {
    public String[] sortPeople(String[] names, int[] heights) {
        int m = names.length, mx = 0, mn = 100001;
        String[] map = new String[100001];

        for (int i = 0; i < m; i++) {
            int f = heights[i];

            map[f] = names[i];

            if (f > mx) mx = f;
            if (f < mn) mn = f;
        } 

        for (int i = mx, q = 0; i >= mn; i--) {
            if (map[i] != null) names[q++] = map[i];
        }

        return names;
    }
}
