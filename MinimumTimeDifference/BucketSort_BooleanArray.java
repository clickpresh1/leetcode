class Solution {
    public int findMinDifference(List<String> timePoints) {
        int m = timePoints.size(), mn = 1441, mx = -1, mnDiff = Integer.MAX_VALUE, mod = 1440;
        boolean[] boo = new boolean[1440];

        if (m > mod) return 0;

        for (String s : timePoints) {
            int f = mins(s);

            if (boo[f]) return 0;
            boo[f] = true;

            mn = Math.min(f, mn);
            mx = Math.max(f, mx);
        } 

        int prev = mn;
        for (int i = mn + 1; i < mx + 1; i++) {
            if (boo[i]) {
                mnDiff = Math.min(Math.abs(i - prev), mnDiff);

                prev = i;
            }
        } 

        mnDiff = Math.min(mn + mod - mx, mnDiff);

        return mnDiff;
    } 

    public static int mins(String s) {
        char[] arr = s.toCharArray();

        int a = ((arr[0] - '0') * 10) + (arr[1] - '0'), b = ((arr[3] - '0') * 10) + (arr[4] - '0');

        return (a * 60) + b;
    } 
}
