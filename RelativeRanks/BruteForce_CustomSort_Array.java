class Solution {
    public String[] findRelativeRanks(int[] score) {
        String[] ans = new String[score.length];
        int[][] arr = new int[score.length][2];

        for (int i = 0; i < score.length; i++) {
            arr[i][0] = i;
            arr[i][1] = score[i];
        } 

        Arrays.sort(arr, Comparator.comparingInt(a -> a[1]));

        for (int i = arr.length - 1; i >= 0; i--) {
            if (i == arr.length - 1) ans[arr[i][0]] = "Gold Medal";
            else if (i == arr.length - 2) ans[arr[i][0]] = "Silver Medal";
            else if (i == arr.length - 3) ans[arr[i][0]] = "Bronze Medal";

            else ans[arr[i][0]] = String.valueOf(arr.length - i);
        }

        return ans;
    }
}
