class Solution {
    public double trimMean(int[] arr) {
        int m = arr.length, sum = 0;

        double small = m * 0.05, large = m - small;

        Arrays.sort(arr);

        for (int i = (int) small; i < (int) large; i++) sum += arr[i];

        return sum / (m - small - small);
    }
}
