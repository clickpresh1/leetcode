class Solution {
    public int findMinDifference(List<String> timePoints) {
        int m = timePoints.size(), mn = Integer.MAX_VALUE;
        int[] arr = new int[m], rra = new int[m];
        int mod = mins("24:00");

        if (m > mod) return 0;

        for (int i = 0; i < m; i++) arr[i] = mins(timePoints.get(i));

        Arrays.sort(arr);

        for (int i = 1; i < m; i++) {
            int diff1 = Math.abs(arr[i] - arr[i - 1]);
            int diff2 = Math.abs((arr[i] + mod) - arr[i - 1]);
            int diff3 = Math.abs(arr[i] - (arr[i - 1] + mod));

            int diff = least(diff1, diff2, diff3);

            if (diff < mn) mn = diff;
        } 

        int diff1 = Math.abs(arr[0] - arr[m - 1]);
        int diff2 = Math.abs((arr[0] + mod) - arr[m - 1]);
        int diff3 = Math.abs(arr[0] - (arr[m - 1] + mod));

        int diff = least(diff1, diff2, diff3);

        if (diff < mn) mn = diff;

        return mn;
    } 

    public static int mins(String s) {
        char[] arr = s.toCharArray();

        int a = ((arr[0] - '0') * 10) + (arr[1] - '0'), b = ((arr[3] - '0') * 10) + (arr[4] - '0');

        return (a * 60) + b;
    } 

    public static int least(int a, int b, int c) {
        int mn = a;
        if (b < mn) mn = b;
        if (c < mn) mn = c;

        return mn;
    }
}
